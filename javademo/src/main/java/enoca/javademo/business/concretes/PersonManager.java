package enoca.javademo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enoca.javademo.business.abstracts.PersonService;
import enoca.javademo.core.utilities.result.DataResult;
import enoca.javademo.core.utilities.result.Result;
import enoca.javademo.core.utilities.result.SuccessDataResult;
import enoca.javademo.core.utilities.result.SuccessResult;
import enoca.javademo.dataAccess.abstracts.PersonDao;
import enoca.javademo.entities.concretes.Person;

@Service
public class PersonManager implements PersonService{

	private PersonDao personDao;
	
	@Autowired
	public PersonManager(PersonDao personDao) {
		super();
		this.personDao = personDao;
	}

	@Override
	public DataResult<List<Person>> getAll() {
		var result=personDao.findAll();
		return new SuccessDataResult<List<Person>>(result);
	}

	@Override
	public Result add(Person person) {
		personDao.save(person);
		return new SuccessResult("Personel is added");
	}

	@Override
	public Result delete(int personId) {
		personDao.deleteById(personId);
		return new SuccessResult("Personel is deleted");
	}

	@Override
	public Result update(Person person) {
		personDao.save(person);
		return new SuccessResult("Personel is updated");
	}
	
	

}
