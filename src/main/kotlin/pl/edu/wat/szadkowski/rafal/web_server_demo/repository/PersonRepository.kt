package pl.edu.wat.szadkowski.rafal.web_server_demo.repository

import org.springframework.data.jpa.repository.JpaRepository
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.Person
import java.util.UUID

interface PersonRepository: JpaRepository<Person, UUID>