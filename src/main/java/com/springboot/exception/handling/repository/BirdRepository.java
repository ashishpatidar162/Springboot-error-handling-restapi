package com.springboot.exception.handling.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.exception.handling.dto.Bird;

public interface BirdRepository extends CrudRepository<Bird, Long> {

}
