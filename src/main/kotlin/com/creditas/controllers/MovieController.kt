package com.creditas.controllers

import com.creditas.models.Movie
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieController
{
    val movies: Array<Movie> = arrayOf(
            Movie(
                    1,
                    "Soy Leyenda",
                    "Foo The Director",
                    2012,
                    40.00F,
                    true
            ),
            Movie(
                    2,
                    "Soy Foo",
                    "Foo The Director",
                    2015,
                    36.00F,
                    false
            ),
            Movie(
                    3,
                    "Hace Calor",
                    "The Torrefactor",
                    2009,
                    36.00F,
                    false
            ),
            Movie(
                    4,
                    "The X",
                    "John Doe",
                    2011,
                    42.00F,
                    false
            )
    );

    @GetMapping ("/movies")

    fun getAllMovies(
            @RequestParam(value = "name", defaultValue = "all")
            name: String
    ): Array<Movie>
    {
        return movies;
    }

    @GetMapping ("/movie")
    fun getMovie(
            @RequestParam(value = "id", defaultValue = "0")
            id: Int
    ): Movie?
    {
        for (movie in movies){
            if (movie.id.equals(id)) {
                return movie;
            }
        }

        return null;
    }
}