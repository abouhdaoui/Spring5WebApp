package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by abouhdaoui on 03/05/2020
 */

public interface BookRepository extends CrudRepository<Book, Long> {


}

