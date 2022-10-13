package enoca.javademo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import enoca.javademo.entities.concretes.Person;

public interface PersonDao extends JpaRepository<Person, Integer>{

}
