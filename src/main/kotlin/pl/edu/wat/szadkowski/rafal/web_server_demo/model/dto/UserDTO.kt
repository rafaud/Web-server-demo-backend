package pl.edu.wat.szadkowski.rafal.web_server_demo.model.dto

import pl.edu.wat.szadkowski.rafal.web_server_demo.model.enum.Sex
import java.util.UUID

data class UserDTO (
    var id: UUID? = null,
    val username: String,
    val password: String,
    val sex: Sex
    )