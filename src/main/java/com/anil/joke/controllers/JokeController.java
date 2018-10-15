/**
 * 
 */
package com.anil.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anil.joke.service.JokeService;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class JokeController {

	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	@RequestMapping({ "" })
	public String getJokes(Model model) {
		model.addAttribute("joke", jokeService.getJokes());
		return "joke/chuckNorris";

	}

}
