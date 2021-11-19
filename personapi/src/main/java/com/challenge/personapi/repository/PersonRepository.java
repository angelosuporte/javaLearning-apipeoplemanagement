package com.challenge.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.personapi.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Long>{
}
