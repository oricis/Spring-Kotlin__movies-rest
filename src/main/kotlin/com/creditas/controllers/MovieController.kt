package com.creditas.controllers

import com.creditas.models.Movie
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieController
{

    @GetMapping ("/movies")
    fun getAllMovies(
        @RequestParam(value = "name", defaultValue = "all")
        name: String
    )
    {
        Movie(
                1,
                "Soy Leyenda",
                "Foo The Director",
                2012,
                40.00F,
                true
        );
    }
}