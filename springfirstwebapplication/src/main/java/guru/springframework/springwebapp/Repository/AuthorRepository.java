package guru.springframework.springwebapp.Repository;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.springwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>
{

}
