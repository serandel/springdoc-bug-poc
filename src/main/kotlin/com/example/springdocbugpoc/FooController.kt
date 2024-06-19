package com.example.springdocbugpoc

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.tags.Tag
import java.awt.print.Book
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/foo")
@Tag(name = "Foo", description = "Foo operations")
class FooController {
    @PostMapping(
        value = ["/"],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
    )
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @Operation(summary = "Post a foo")
    @ApiResponse(responseCode = "204", description = "Foo posted")
    fun postFoo(
        @Parameter(schema = Schema(implementation = Foo::class))
        foo: Foo
    ) {
        println("Received foo: $foo")
    }
}
