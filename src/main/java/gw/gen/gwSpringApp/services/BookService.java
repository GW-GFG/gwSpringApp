package gw.gen.gwSpringApp.services;

import gw.gen.gwSpringApp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
