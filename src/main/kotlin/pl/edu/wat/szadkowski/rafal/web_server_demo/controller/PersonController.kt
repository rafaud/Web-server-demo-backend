package pl.edu.wat.szadkowski.rafal.web_server_demo.controller

import org.springframework.web.bind.annotation.*
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.Person
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.dto.PersonDTO
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.mapper.toDto
import pl.edu.wat.szadkowski.rafal.web_server_demo.repository.PersonRepository
import pl.edu.wat.szadkowski.rafal.web_server_demo.service.PersonService
import java.util.UUID

@RestController
class PersonController (
    val personService: PersonService
    )
{

    @GetMapping("/hello_world")
    fun helloWorld(): String {
        return "Hello world!"
    }

    @PostMapping("/person")
    fun createPerson(@RequestBody personDTO: PersonDTO): PersonDTO {
        return personService.createPerson(personDTO)
    }

    @GetMapping("/person/{id}")
    fun getPersonById(@PathVariable id: UUID) : PersonDTO {
        return personService.getPersonById(id)
    }
    @GetMapping("/person/all")
    fun getAllPeople(): List<PersonDTO> {
        return personService.getAllPeople().map { it.toDto() }
    }

    @PutMapping("/person")
    fun updatePerson(@RequestBody personDTO: PersonDTO): PersonDTO {
        return personService.updatePerson(personDTO)
    }

    @DeleteMapping("/person/{id}")
    fun deletePerson(@PathVariable id: UUID) {
        return personService.deletePerson(id)
    }
}