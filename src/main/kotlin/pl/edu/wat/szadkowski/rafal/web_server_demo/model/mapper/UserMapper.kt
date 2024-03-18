package pl.edu.wat.szadkowski.rafal.web_server_demo.model.mapper

import pl.edu.wat.szadkowski.rafal.web_server_demo.model.User
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.dto.UserDTO

fun User.toDto() = UserDTO(
        id = id,
        username = username,
        password = password,
        sex = sex
)

fun UserDTO.toModel() = User(
        id = id,
        username = username,
        password = password,
        sex = sex
)