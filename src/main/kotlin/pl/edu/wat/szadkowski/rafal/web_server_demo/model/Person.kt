package pl.edu.wat.szadkowski.rafal.web_server_demo.model

import pl.edu.wat.szadkowski.rafal.web_server_demo.model.enum.Sex
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null,
    var name: String,
    var surname: String,
    @Enumerated(EnumType.STRING)
    var sex: Sex,
)
