package kz.urazov.damir.spring5webapp.repositories;

import kz.urazov.damir.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
