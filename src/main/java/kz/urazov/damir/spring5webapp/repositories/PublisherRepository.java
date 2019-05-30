package kz.urazov.damir.spring5webapp.repositories;

import kz.urazov.damir.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
