package gw.gen.gwSpringApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import gw.gen.gwSpringApp.domain.Author;
import gw.gen.gwSpringApp.domain.Book;
import gw.gen.gwSpringApp.domain.Publisher;
import gw.gen.gwSpringApp.repositories.AuthorRepository;
import gw.gen.gwSpringApp.repositories.BookRepository;
import gw.gen.gwSpringApp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    
    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        Author gwen = new Author();
        gwen.setFirstName("Gwendoline");
        gwen.setLastName("Gfg");

        Book wonderfulNovel = new Book();
        wonderfulNovel.setTitle("Wonderful Novel");
        wonderfulNovel.setIsbn("123456");

        Author gwenSaved = authorRepository.save(gwen);
        Book wonderfulNovelSaved = bookRepository.save(wonderfulNovel);

        Author helene = new Author();
        helene.setFirstName("Hélène");
        helene.setLastName("Mary");

        Book wonderfulPoetry = new Book();
        wonderfulPoetry.setTitle("Wonderful Poetry");
        wonderfulPoetry.setIsbn("123457");

        Author heleneSaved = authorRepository.save(helene);
        Book wonderfulPoetrySaved = bookRepository.save(wonderfulPoetry);

        gwenSaved.getBooks().add(wonderfulNovelSaved);
        wonderfulNovelSaved.getAuthors().add(gwenSaved);
        heleneSaved.getBooks().add(wonderfulPoetrySaved);
        wonderfulNovelSaved.getAuthors().add(heleneSaved);

        Publisher galinace = new Publisher();
        galinace.setPublisherName("Galinacé");
        galinace.setAdress("12 Main Street");
        galinace.setCity("L.A.");
        galinace.setState("California");
        galinace.setZip("90001");

        Publisher galinaceSaved = publisherRepository.save(galinace);
        wonderfulNovelSaved.setPublisher(galinaceSaved);
        wonderfulPoetrySaved.setPublisher(galinaceSaved);

        authorRepository.save(gwenSaved);
        authorRepository.save(heleneSaved);
        bookRepository.save(wonderfulNovelSaved);
        bookRepository.save(wonderfulPoetrySaved);

        System.out.println("In bootsrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());


        System.out.println("Publisher count: " + publisherRepository.count());
    }

}
