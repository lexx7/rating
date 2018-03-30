package ru.intg.rating.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.intg.rating.web.persistance.entity.Visit;
import ru.intg.rating.web.persistance.repository.VisitsRepository;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    private VisitsRepository visitsRepository;
    public IndexController(VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("name", "Alexey");

        Visit visit = new Visit();
        visit.description = String.format("Visited as %s", LocalDateTime.now());
        visitsRepository.save(visit);

        return new ModelAndView("index", model);
    }
}
