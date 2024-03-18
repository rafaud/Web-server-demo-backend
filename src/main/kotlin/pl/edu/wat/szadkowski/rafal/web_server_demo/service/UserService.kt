package pl.edu.wat.szadkowski.rafal.web_server_demo.service

import org.springframework.stereotype.Service
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.User
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.dto.UserDTO
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.mapper.toDto
import pl.edu.wat.szadkowski.rafal.web_server_demo.model.mapper.toModel
import pl.edu.wat.szadkowski.rafal.web_server_demo.repository.UserRepository
import java.util.UUID

@Service
class UserService (
  val userRepository: UserRepository
) {
    fun createUser(userDTO: UserDTO): UserDTO {
        userDTO.id = null
        return userRepository.save(userDTO.toModel()).toDto()
    }

    fun getUserById(id: UUID): UserDTO {
        return userRepository.findById(id).get().toDto()
    }

    fun getAllPeople(): MutableList<User> {
        return userRepository.findAll()
    }

    fun updateUser(userDTO: UserDTO): UserDTO {
        return userRepository.save(userDTO.toModel()).toDto()
    }

    fun deleteUser(uuid: UUID)  {
        return userRepository.deleteById(uuid)
    }
}