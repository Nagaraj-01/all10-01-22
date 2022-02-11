package guru.springframework.springwebapp.Repository;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>
{
	
}
