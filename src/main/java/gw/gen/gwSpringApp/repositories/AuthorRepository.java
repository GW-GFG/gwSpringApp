package gw.gen.gwSpringApp.repositories;

import org.springframework.data.repository.CrudRepository;

import gw.gen.gwSpringApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
