package pl.edu.wat.szadkowski.rafal.web_server_demo.controller

import org.springframework.web.bind.annotation.*
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.Person
import pl.edu.wat.szadkowski.rafal.web_server_demo.repository.PersonRepository

@RestController
class PersonController (
    val personRepository: PersonRepository
        ) {
    @GetMapping("/person/all")
    fun getAllPeople(): List<Person> {
        return personRepository.findAll()
    }

    @PostMapping("/person")
    fun addPerson(@RequestBody person: Person): Person {
        person.id = null
        return personRepository.save(person)
    }
}