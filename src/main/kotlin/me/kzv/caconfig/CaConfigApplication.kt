package me.kzv.caconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class CaConfigApplication

fun main(args: Array<String>) {
    runApplication<CaConfigApplication>(*args)
}
