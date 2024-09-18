package jessylavorel.exercices.service;

import jessylavorel.exercices.dto.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author 20008590
 */
@Service
public class UserService {

    private static final int ADULT_AGE_LIMIT = 18;
    private static final List<Person> PERSONS = new ArrayList<Person>() {
        {
            add(Person.builder().number(1).lastName("Dupont").firstName("Jean").age(40).build());
            add(Person.builder().number(1).lastName("Cristal").firstName("Alice").age(15).build());
            add(Person.builder().number(1).lastName("Gamelin").firstName("Dexter").age(12).build());
            add(Person.builder().number(1).lastName("Beaudry").firstName("Nicole").age(24).build());
        }
    };

    public List<Person> getAllPersons() {
        return PERSONS;
    }

    public List<Person> getAdultPersons() {
        return PERSONS.stream()
                .filter(person -> person.getAge()>=ADULT_AGE_LIMIT)
                .sorted(Comparator.comparing(Person::getAge))
                .toList();
    }

    public List<String> getAdultPersonNames() {
        return getAdultPersons()
                .stream()
                .map(Person::getFirstName)
                .toList();
    }
}
