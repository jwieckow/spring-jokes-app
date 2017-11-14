package com.example.jokeapp;

import com.example.jokeapp.controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokeAppApplication {

	public static void main(String[] args) {

	    ApplicationContext ctx = SpringApplication.run(JokeAppApplication.class, args);

        JokesController jokesController = (JokesController) ctx.getBean("jokesController");

        System.out.println(jokesController.getChuckJoke());


    }
}
