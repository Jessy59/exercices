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
@RestController
@RequiredArgsConstructor
public class PersonController {

    private final UserService userService;

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return userService.getAllPersons();
    }

    @GetMapping("/adult-persons")
    public List<Person> getAdultPersons() {
        return userService.getAdultPersons();
    }

    @GetMapping("/adult-persons/firstnames")
    public List<String> getAdultPersonFirstNames() {
        return userService.getAdultPersonNames();
    }
}
