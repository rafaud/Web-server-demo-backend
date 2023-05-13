package pl.edu.wat.szadkowski.rafal.web_server_demo.model.mapper

import pl.edu.wat.szadkowski.rafal.web_server_demo.model.Person
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.dto.PersonDTO

fun Person.toDto() = PersonDTO(
    id = id,
    name = name,
    surname = surname,
    sex = sex
)

fun PersonDTO.toModel() = Person(
    id = id,
    name = name,
    surname = surname,
    sex = sex
)