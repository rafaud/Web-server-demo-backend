package pl.edu.wat.szadkowski.rafal.web_server_demo.service

import org.springframework.stereotype.Service
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.Person
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.dto.PersonDTO
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.mapper.toDto
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.mapper.toModel
import pl.edu.wat.szadkowski.rafal.web_server_demo.repository.PersonRepository
import java.util.UUID

@Service
class PersonService (
  val personRepository: PersonRepository
) {
    fun createPerson(personDTO: PersonDTO): PersonDTO {
        personDTO.id = null
        return personRepository.save(personDTO.toModel()).toDto()
    }

    fun getPersonById(id: UUID): PersonDTO {
        return personRepository.findById(id).get().toDto()
    }

    fun getAllPeople(): MutableList<Person> {
        return personRepository.findAll()
    }

    fun updatePerson(personDTO: PersonDTO): PersonDTO {
        return personRepository.save(personDTO.toModel()).toDto()
    }

    fun deletePerson(uuid: UUID)  {
        return personRepository.deleteById(uuid)
    }
}