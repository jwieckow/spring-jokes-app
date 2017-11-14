package com.example.jokeapp.controllers;

import com.example.jokeapp.services.IGetJoke;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class JokesController {

    private IGetJoke iGetJoke;

    public JokesController(@Qualifier("getJokeService") IGetJoke iGetJoke) {
        this.iGetJoke = iGetJoke;
    }

    public String getChuckJoke(){

        return iGetJoke.getJoke();
    }
}
