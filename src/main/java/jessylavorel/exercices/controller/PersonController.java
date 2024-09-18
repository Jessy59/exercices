package jessylavorel.exercices.controller;

import jessylavorel.exercices.dto.Person;
import jessylavorel.exercices.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 20008590
 */
public class PersonController {

    public List<Person> getPersons() {
        // TODO : call getPersons()
        return List.of();
    }

    public List<Person> getAdultPersons() {
        // TODO : call getAdultPersons();
        return List.of();
    }

    public List<String> getAdultPersonFirstNames() {
        // TODO : call getAdultPersonNames();
        return List.of();
    }
}
