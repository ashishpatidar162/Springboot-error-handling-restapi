package com.springboot.exception.handling.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.handling.dto.Bird;
import com.springboot.exception.handling.service.BirdService;

@RestController
@RequestMapping("/birds")
public class BirdController {

	@Autowired
	private BirdService birdService;
	
	@PostMapping("/createBirds")
	public Bird createBirds(@RequestBody @Valid Bird bird) {
	return birdService.createBird(bird);
	}
	
}
