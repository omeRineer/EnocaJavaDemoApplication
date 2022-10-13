package enoca.javademo.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import enoca.javademo.business.abstracts.PersonService;
import enoca.javademo.core.utilities.result.DataResult;
import enoca.javademo.core.utilities.result.Result;
import enoca.javademo.entities.concretes.Person;

@RestController
@RequestMapping("/api/persons")
public class PersonsController {

	private PersonService personService;

	@Autowired
	public PersonsController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	@Transactional
	@GetMapping("")
	public DataResult<List<Person>> getAll(){
		var result=personService.getAll();
		return result;
	}
	
	@Transactional
	@PostMapping("/add")
	public Result add(@RequestBody Person person) {
		var result=personService.add(person);
		return result;
	}
	
	@Transactional
	@GetMapping("/delete/{personId}")
	public Result delete(@PathVariable int personId) {
		var result=personService.delete(personId);
		return result;
	}
	
	@Transactional
	@PostMapping("/update")
	public Result update(@RequestBody Person person) {
		var result=personService.update(person);
		return result;
	}
}
