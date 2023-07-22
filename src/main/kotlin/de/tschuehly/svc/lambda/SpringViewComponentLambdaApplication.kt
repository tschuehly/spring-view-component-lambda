package de.tschuehly.svc.lambda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class SpringViewComponentLambdaApplication {
}

fun main(args: Array<String>) {
    runApplication<SpringViewComponentLambdaApplication>(*args)
}
