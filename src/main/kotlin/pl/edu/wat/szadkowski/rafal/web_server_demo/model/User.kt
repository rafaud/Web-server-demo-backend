package pl.edu.wat.szadkowski.rafal.web_server_demo.model

import pl.edu.wat.szadkowski.rafal.web_server_demo.model.enum.Sex
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null,
    var username: String,
    var password: String,
    @Enumerated(EnumType.STRING)
    var sex: Sex,
)
