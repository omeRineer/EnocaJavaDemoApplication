package enoca.javademo.business.abstracts;

import java.util.List;

import enoca.javademo.core.utilities.result.DataResult;
import enoca.javademo.core.utilities.result.Result;
import enoca.javademo.entities.concretes.Company;

public interface CompanyService {
	DataResult<List<Company>> getAll();
	Result add(Company company);
	Result delete(int companyId);
	Result update(Company company);
}
