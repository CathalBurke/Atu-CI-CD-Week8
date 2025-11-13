package ie.atu.week7.controller;

import ie.atu.week7.Person;
import ie.atu.week7.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person create(@RequestBody Person person) {
        person.setId(null);
        return service.create(person);
    }

    // READ All
    @GetMapping
    public List<Person> getAll() {
        return service.findAll();
    }

    // READ ONE (by employeeId)
    @GetMapping("/{employeeId}")
    public Person getByEmployeeId(@PathVariable String employeeId) {
        return service.findByEmployeeId(employeeId);
    }
    // UPDATE
    @PutMapping("/{employeeId}")
    public Person update(@PathVariable String employeeId, @RequestBody Person person) {
        person.setId(null); // ignore id from client
        return service.update(employeeId, person);
    }

}
