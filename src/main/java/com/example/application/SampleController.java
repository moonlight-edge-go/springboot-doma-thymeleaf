package com.example.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.service.SampleService;

import lombok.val;

/**
 * SampleController.java.
 *
 * @author MEG
 *
 */
@Controller("/test")
public class SampleController {

	/** service. */
	@Autowired
	private SampleService service;

	/**
	 * Show list.
	 *
	 * @return ModelAndView
	 */
	@GetMapping("/all")
	public ModelAndView showAll() {
		val mav = new ModelAndView("sample");
		mav.addObject("sample-obj", service.getAllDate());
		return mav;
	}

}
