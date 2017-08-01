package com.example.infrastructure.repository;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.domain.SampleBean;
import com.example.domain.SampleForm;

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

	@Select
	SampleBean find(Integer id);

	@Update(sqlFile = true)
	int update(Integer id, SampleForm form);

	@Insert(sqlFile = true)
	int insert(SampleForm form);

	@Delete(sqlFile = true)
	int delete(Integer id);
}
