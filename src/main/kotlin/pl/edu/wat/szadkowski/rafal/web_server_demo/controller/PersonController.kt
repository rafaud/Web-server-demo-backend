package pl.edu.wat.szadkowski.rafal.web_server_demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.Person
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.enum.Sex
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
    fun addPerson(@RequestParam person: Person): Person {
        person.id = null
        return personRepository.save(person)
    }

    @GetMapping("/person/add_random")
    fun addRandomPerson(): Person {
        return personRepository.save(
            Person(name = "Karol",
            surname = "Hermak",
            sex = Sex.MALE)
        )
    }
}