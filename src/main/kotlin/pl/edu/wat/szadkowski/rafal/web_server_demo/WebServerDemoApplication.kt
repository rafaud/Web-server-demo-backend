package pl.edu.wat.szadkowski.rafal.web_server_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebServerDemoApplication

fun main(args: Array<String>) {
    runApplication<WebServerDemoApplication>(*args)
}
