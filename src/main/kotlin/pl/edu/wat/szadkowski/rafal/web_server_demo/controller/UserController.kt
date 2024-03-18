package pl.edu.wat.szadkowski.rafal.web_server_demo.controller

import org.springframework.web.bind.annotation.*
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.dto.UserDTO
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.mapper.toDto
import pl.edu.wat.szadkowski.rafal.web_server_demo.service.UserService
import java.util.UUID

@RestController
class UserController (
    val userService: UserService
    )
{

    @GetMapping("/hello_world")
    fun helloWorld(): String {
        return "Hello world!"
    }

    @PostMapping("/user")
    fun createUser(@RequestBody userDTO: UserDTO): UserDTO {
        return userService.createUser(userDTO)
    }

    @GetMapping("/user/{id}")
    fun getUserById(@PathVariable id: UUID) : UserDTO {
        return userService.getUserById(id)
    }
    @GetMapping("/user")
    fun getAllPeople(): List<UserDTO> {
        return userService.getAllPeople().map { it.toDto() }
    }

    @PutMapping("/user")
    fun updateUser(@RequestBody userDTO: UserDTO): UserDTO {
        return userService.updateUser(userDTO)
    }

    @DeleteMapping("/user/{id}")
    fun deleteUser(@PathVariable id: UUID) {
        return userService.deleteUser(id)
    }
}