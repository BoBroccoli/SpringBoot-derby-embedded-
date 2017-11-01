package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	private static List<Person> persons = new ArrayList<Person>(Arrays.asList(
			new Person("1","Alice","I am a student"),
			new Person("2","Bob","I am a artist"),
			new Person("3","Eve","I am a pilot")
			));
	public List<Person> getAllPerson() {
		List<Person> list = new ArrayList<Person>();
		personRepository.findAll().forEach(list::add);;
		return list;
	}

	public Person getPersonById(String id) {

		return 	personRepository.findOne(id);
	}

	public void addPerson(Person Person) {
		personRepository.save(Person);
		return;
	}
}
