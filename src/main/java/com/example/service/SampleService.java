package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.SampleBean;
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
	public List<SampleBean> getAllDate() {
		return repo.findAll();
	}

}
