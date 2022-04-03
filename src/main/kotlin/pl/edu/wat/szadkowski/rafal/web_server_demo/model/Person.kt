package pl.edu.wat.szadkowski.rafal.web_server_demo.model

import pl.edu.wat.szadkowski.rafal.web_server_demo.model.enum.Sex
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    val name: String,
    val surname: String,
    val sex: Sex,
)
