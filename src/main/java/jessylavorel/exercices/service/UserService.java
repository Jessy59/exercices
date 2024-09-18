package jessylavorel.exercices.service;

import jessylavorel.exercices.dto.Genre;
import jessylavorel.exercices.dto.Person;
import org.apache.logging.log4j.util.Strings;
import org.aspectj.weaver.patterns.PerObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author 20008590
 */
public class UserService {

    private static final List<Person> PERSONS = new ArrayList<Person>() {
        {
            add(Person.builder().number(1).lastName("Dupont").firstName("Jean").age(40).genre(Genre.M).build());
            add(Person.builder().number(1).lastName("Cristal").firstName("Alice").age(15).genre(Genre.F).build());
            add(Person.builder().number(1).lastName("Gamelin").firstName("Dexter").age(12).genre(Genre.UNKNOWN).build());
            add(Person.builder().number(1).lastName("Beaudry").firstName("Nicole").age(24).genre(Genre.UNKNOWN).build());
        }
    };

    public static void main(String[] args) {
        for (Person person : PERSONS) {
            String result;
            switch (person.getGenre()) {
                case M:
                    result = "Mal";
                    break;
                case F:
                    result = "Female";
                    break;
                default:
                    result = "Unknown";
            }
            System.out.println(result);
        }
    }
}
