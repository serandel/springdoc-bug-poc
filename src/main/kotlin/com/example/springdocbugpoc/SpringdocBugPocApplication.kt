package com.example.springdocbugpoc

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(
	info =
	Info(
		title = "Foo API",
		version = "v1",
		summary = "PoC for reproducing https://github.com/springdoc/springdoc-openapi/issues/2623",
	)
)
class SpringdocBugPocApplication

fun main(args: Array<String>) {
	runApplication<SpringdocBugPocApplication>(*args)
}
