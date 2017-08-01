package com.example.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

/**
 * SampleForm.java.
 *
 * @author DN
 *
 */
@Getter
@Setter
public class SampleForm {

	/** name. */
	@NotNull
	@Size(max = 30)
	private String name;

	/** age. */
	@NotNull
	@Range(min = 0, max = 130)
	private Integer age;
}
