package com.example.jokeapp.controllers;

import com.example.jokeapp.services.IGetJoke;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private IGetJoke iGetJoke;

    public JokesController(@Qualifier("getJokeService") IGetJoke iGetJoke) {
        this.iGetJoke = iGetJoke;
    }

    @RequestMapping({"/", ""})
    public String getChuckJoke(Model model){

        model.addAttribute("joke", iGetJoke.getJoke());

        return "chucknorris";
    }
}
