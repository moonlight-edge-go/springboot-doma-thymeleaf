package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.SampleBean;
import com.example.domain.SampleForm;
import com.example.infrastructure.repository.SampleRepository;

/**
 * SampleService.java.
 *
 * @author MEG
 *
 */
@Service
public class SampleService {

	/** repo. */
	@Autowired
	private SampleRepository repo;

	/**
	 * Get All.
	 *
	 * @return Array.SampleBean
	 */
	public List<SampleBean> getAllData() {
		return repo.findAll();
	}

	/**
	 * Get.
	 *
	 * @param id ID
	 * @return SampleBean
	 */
	public SampleBean getData(Integer id) {
		return repo.find(id);
	}

	/**
	 * Update.
	 *
	 * @param id ID
	 * @param form Form
	 */
	public void updateData(Integer id, SampleForm form) {
		repo.update(id, form);
	}

	/**
	 * Regist.
	 *
	 * @param form Form
	 */
	public void registData(SampleForm form) {
		repo.insert(form);
	}

	/**
	 * Delete.
	 *
	 * @param id ID
	 */
	public void deleteData(Integer id) {
		repo.delete(id);
	}

}
