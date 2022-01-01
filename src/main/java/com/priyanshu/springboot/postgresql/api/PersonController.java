package com.priyanshu.springboot.postgresql.api;

import com.priyanshu.springboot.postgresql.model.Person;
import com.priyanshu.springboot.postgresql.service.PersonService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    public final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public String addPerson(@RequestBody Person person) throws JSONException {
        int check = personService.addPerson(person);
        JSONObject jo = new JSONObject();
        jo.put("success", check == 1);
        return jo.toString();
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id) {
        return personService.getPersonById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public String deletePerson(@PathVariable("id") UUID id) throws JSONException {
        int check = personService.deletePerson(id);
        JSONObject jo = new JSONObject();
        jo.put("success", check == 1);
        return jo.toString();
    }

    @PutMapping(path = "{id}")
    public String updatePerson(@PathVariable("id") UUID id, @RequestBody Person personToUpdate) throws JSONException {
        int check = personService.updatePerson(id, personToUpdate);
        JSONObject jo = new JSONObject();
        jo.put("success", check == 1);
        return jo.toString();
    }
}
