package com.challenge.personapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.personapi.dto.response.MessageResponseDTO;
import com.challenge.personapi.entity.Person;
import com.challenge.personapi.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	private PersonRepository personRepository;
	
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	
	@PostMapping
	public MessageResponseDTO createPerson(@RequestBody Person person) {
		Person savedPerson = personRepository.save(person);
		return MessageResponseDTO.builder().message("Created person with ID" + savedPerson.getId()).builder();
	}
}
