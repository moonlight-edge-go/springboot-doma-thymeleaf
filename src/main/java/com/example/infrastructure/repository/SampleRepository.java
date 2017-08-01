package com.example.infrastructure.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.domain.SampleBean;

/**
 * SampleRepository.java.
 *
 * @author MEG
 *
 */
@Dao
@ConfigAutowireable
public interface SampleRepository {

	@Select
	List<SampleBean> findAll();

}
