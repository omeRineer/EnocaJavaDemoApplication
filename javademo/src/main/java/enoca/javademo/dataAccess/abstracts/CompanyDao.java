package enoca.javademo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import enoca.javademo.entities.concretes.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {

}
