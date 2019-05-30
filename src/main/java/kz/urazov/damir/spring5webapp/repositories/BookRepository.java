package kz.urazov.damir.spring5webapp.repositories;

import kz.urazov.damir.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
