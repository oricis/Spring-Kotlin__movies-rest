package com.creditas.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieController
{

    @GetMapping ("/movies")
    fun getAllMovies()
    {

    }
}