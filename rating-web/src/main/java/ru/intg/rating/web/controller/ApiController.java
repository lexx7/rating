package ru.intg.rating.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.intg.rating.web.persistance.entity.Visit;
import ru.intg.rating.web.persistance.repository.VisitsRepository;

@RestController
@RequestMapping("/api")
@Slf4j
public class ApiController {
    final VisitsRepository visitsRepository;

    public ApiController(VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    @GetMapping("/visits")
    public Iterable<Visit> getVisits() {
        log.info("Found all records");
        return visitsRepository.findAll();
    }
}
