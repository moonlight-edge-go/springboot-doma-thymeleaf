package com.example.application;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.SampleForm;
import com.example.service.SampleService;

import lombok.val;

/**
 * SampleController.java.
 *
 * @author MEG
 *
 */
@Controller
public class SampleController {

	/** service. */
	@Autowired
	private SampleService service;

	@ModelAttribute
	SampleForm setUpForm() {
		return new SampleForm();
	}

	@GetMapping("list")
	public ModelAndView showAll() {
		val mav = new ModelAndView("sample/list");
		val samples = service.getAllData();
		mav.addObject("samples", samples);
		return mav;
	}

	@PostMapping("/regist")
	public ModelAndView regist(@Validated SampleForm form, BindingResult result) {
		if (result.hasErrors()) {
			return showAll();
		}
		service.registData(form);
		return new ModelAndView("redirect:/list");
	}

	@GetMapping("edit")
	public ModelAndView updateForm(@RequestParam Integer id, SampleForm form) {
		val data = service.getData(id);
		BeanUtils.copyProperties(data, form);
		val mav = new ModelAndView("sample/edit");
		mav.addObject("id", id);
		mav.addObject("form", form);
		return mav;

	}

	@PostMapping("edit")
	public ModelAndView update(@RequestParam Integer id, @Valid SampleForm form, BindingResult result) {
		if (result.hasErrors()) {
			return updateForm(id, form);
		}
		service.updateData(id, form);
		return new ModelAndView("redirect:/list");
	}

	@PostMapping("/delete")
	public ModelAndView delete(@RequestParam Integer id) {
		service.deleteData(id);
		return new ModelAndView("redirect:/list");
	}

}
