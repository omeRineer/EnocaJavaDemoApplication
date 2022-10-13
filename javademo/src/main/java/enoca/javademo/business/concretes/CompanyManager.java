package enoca.javademo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enoca.javademo.business.abstracts.CompanyService;
import enoca.javademo.core.utilities.result.DataResult;
import enoca.javademo.core.utilities.result.Result;
import enoca.javademo.core.utilities.result.SuccessDataResult;
import enoca.javademo.core.utilities.result.SuccessResult;
import enoca.javademo.dataAccess.abstracts.CompanyDao;
import enoca.javademo.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService{

	private CompanyDao companyDao;
	
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>> getAll() {
		var result=companyDao.findAll();
		return new SuccessDataResult<List<Company>>(result);
	}

	@Override
	public Result add(Company company) {
		companyDao.save(company);
		return new SuccessResult();
	}

	@Override
	public Result delete(int companyId) {
		companyDao.deleteById(companyId);
		return new SuccessResult();
	}

	@Override
	public Result update(Company company) {
		companyDao.save(company);
		return new SuccessResult();
	}
	

}
