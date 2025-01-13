package gw.gen.gwSpringApp.services;

import org.springframework.stereotype.Service;

import gw.gen.gwSpringApp.repositories.AuthorRepository;
import gw.gen.gwSpringApp.domain.Author;

@Service
public class AuthorServiceImplementation implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImplementation(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override 
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
