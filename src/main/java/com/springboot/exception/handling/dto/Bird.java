package com.springboot.exception.handling.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class Bird {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "SCIENTIFICNAME")
	private String scientific_Name;

	@Column(name = "SPECIE")
	private String speci;

	@Column(name = "MASS")
	@NotNull
	@Max(104000)
	private Double mass;

	@Column(name = "LENGTH")
	@NotNull
	@Max(210)
	private Integer length;
}
