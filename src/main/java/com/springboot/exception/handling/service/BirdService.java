package com.springboot.exception.handling.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.exception.handling.dto.Bird;
import com.springboot.exception.handling.repository.BirdRepository;

@Service
public class BirdService {

	@Autowired
	private BirdRepository birdRepository;

	public Bird createBird(Bird bird) {
		
		return birdRepository.save(bird);
	}

	
}
