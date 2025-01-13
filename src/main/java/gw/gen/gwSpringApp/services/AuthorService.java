package gw.gen.gwSpringApp.services;

import gw.gen.gwSpringApp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
