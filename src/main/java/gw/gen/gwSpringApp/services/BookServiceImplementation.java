package gw.gen.gwSpringApp.services;

import org.springframework.stereotype.Service;

import gw.gen.gwSpringApp.domain.Book;
import gw.gen.gwSpringApp.repositories.BookRepository;

@Service
public class BookServiceImplementation implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

}
