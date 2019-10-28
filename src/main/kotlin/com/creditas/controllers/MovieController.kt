package com.creditas.controllers

import com.creditas.models.Movie
import org.springframework.web.bind.annotation.*

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
                    "TheFoo",
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
    // Example: http://localhost:8080/movie?id=2

    @RequestMapping ("/movie/{id}")
    fun getMovieById(
            @PathVariable("id")
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
    // Example: http://localhost:8080/movie/2

    @GetMapping ("/movie-title")
    fun getMovieByTitle(
            @RequestParam(value = "title", defaultValue = "")
            title: String
    ): Movie?
    {
        for (movie in movies){
            if (movie.title.equals(title)) {
                return movie;
            }
        }

        return null;
    }
    // Example: http://localhost:8080/movie-title?title=TheFoo
}