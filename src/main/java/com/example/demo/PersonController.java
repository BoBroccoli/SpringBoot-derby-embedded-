package com.example.demo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/persons")
	public List<Person> getAllPerson(){
		return personService.getAllPerson();
	}
	@RequestMapping("/person/{id}")
	public Person getPersonById(@PathVariable String id){
		return personService.getPersonById(id);
	}
	@RequestMapping(method = RequestMethod.POST , value = "/persons")
	public void addPerson(@RequestBody Person person){
		personService.addPerson(person);
	}
}
