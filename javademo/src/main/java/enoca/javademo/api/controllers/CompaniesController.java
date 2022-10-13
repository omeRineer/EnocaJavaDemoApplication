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

import enoca.javademo.business.abstracts.CompanyService;
import enoca.javademo.core.utilities.result.DataResult;
import enoca.javademo.core.utilities.result.Result;
import enoca.javademo.entities.concretes.Company;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
	
	private CompanyService companyService;
	
	@Autowired
	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}


	@Transactional
	@GetMapping("")
	public DataResult<List<Company>> getAll(){
		var result=companyService.getAll();
		return result;
	}
	
	@Transactional
	@PostMapping("/add")
	public Result add(@RequestBody Company company) {
		var result=companyService.add(company);
		return result;
	}
	
	@Transactional
	@GetMapping("/delete/{companyId}")
	public Result delete(@PathVariable int companyId) {
		var result=companyService.delete(companyId);
		return result;
	}
	
	@Transactional
	@PostMapping("/update")
	public Result update(@RequestBody Company company) {
		var result=companyService.update(company);
		return result;
	}
}
