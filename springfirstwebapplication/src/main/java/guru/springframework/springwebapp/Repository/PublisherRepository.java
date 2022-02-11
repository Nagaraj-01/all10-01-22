package guru.springframework.springwebapp.Repository;

import org.springframework.data.repository.CrudRepository;
import guru.springframework.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
