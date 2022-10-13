package enoca.javademo.business.abstracts;

import java.util.List;

import enoca.javademo.core.utilities.result.DataResult;
import enoca.javademo.core.utilities.result.Result;
import enoca.javademo.entities.concretes.Person;

public interface PersonService {
	DataResult<List<Person>> getAll();
	Result add(Person person);
	Result delete(int personId);
	Result update(Person person);
}
