package gw.gen.gwSpringApp.repositories;

import org.springframework.data.repository.CrudRepository;

import gw.gen.gwSpringApp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
