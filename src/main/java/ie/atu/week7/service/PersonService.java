package ie.atu.week7.service;

import ie.atu.week7.Person;
import ie.atu.week7.repoisitory.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public Person create(Person p) {
        return repo.save(p);
    }

    public List<Person> findAll() {
        return repo.findAll();
    }

    public Person findByEmployeeId(String id) {
        return repo.findByEmployeeId(id)
                .orElseThrow(() -> new IllegalArgumentException("Person not found"));
    }
    public Person update(String employeeId, Person updated) {
        // reuse existing method to throw if not found
        Person existing = findByEmployeeId(employeeId);

        existing.setName(updated.getName());
        existing.setEmail(updated.getEmail());
        existing.setPosition(updated.getPosition());
        existing.setDepartment(updated.getDepartment());
        existing.setEmployeeId(updated.getEmployeeId());

        return repo.save(existing);
    }

}
