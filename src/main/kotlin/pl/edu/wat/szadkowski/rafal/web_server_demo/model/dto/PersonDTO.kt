package pl.edu.wat.szadkowski.rafal.web_server_demo.model.dto

import pl.edu.wat.szadkowski.rafal.web_server_demo.model.enum.Sex
import java.util.UUID

data class PersonDTO (
    var id: UUID? = null,
    val name: String,
    val surname: String,
    val sex: Sex
    )