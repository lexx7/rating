package ru.intg.rating.web.persistance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.intg.rating.web.persistance.entity.Visit;

@Repository
public interface VisitsRepository extends CrudRepository<Visit, Long> {
}
