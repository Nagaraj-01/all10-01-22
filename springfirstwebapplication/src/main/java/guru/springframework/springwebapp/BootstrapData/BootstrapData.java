package guru.springframework.springwebapp.BootstrapData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import guru.springframework.springwebapp.Repository.AuthorRepository;
import guru.springframework.springwebapp.Repository.BookRepository;
import guru.springframework.springwebapp.Repository.PublisherRepository;
import guru.springframework.springwebapp.domain.Author;
import guru.springframework.springwebapp.domain.Book;
import guru.springframework.springwebapp.domain.Publisher;

@Component
public class BootstrapData implements CommandLineRunner {
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {

	System.out.println("Started in Bootstarp");

	Publisher publisher=new Publisher();
	publisher.setName("SSS publishing");
	publisher.setCity("Bangalore");
	publisher.setState("Karnataka");

	publisherRepository.save(publisher);

	System.out.println("Publisher number of books : "+publisherRepository.count());

	Author a = new Author("zkteco","biometrics");
	Book ddd = new Book("Domain Driven Design","123456");

	a.getBooks().add(ddd);
	ddd.getAuthors().add(a);

	ddd.setPublisher(publisher);
	publisher.getBooks().add(ddd);


	authorRepository.save(a);
	bookRepository.save(ddd);
	publisherRepository.save(publisher);

	Author var = new Author("Rod","Jhonson");
	Book var1 = new Book("J2EE developers","123456789");
	var.getBooks().add(var1);
	var1.getAuthors().add(var);

	var1.setPublisher(publisher);
	publisher.getBooks().add(var1);

	authorRepository.save(var);
	bookRepository.save(var1);
	publisherRepository.save(publisher);


	System.out.println("number of books : "+bookRepository.count());
	System.out.println("Publisher number of books : "+publisher.getBooks().size());

	}

}
