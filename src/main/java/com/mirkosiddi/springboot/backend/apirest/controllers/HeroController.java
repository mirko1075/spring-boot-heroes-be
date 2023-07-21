package com.mirkosiddi.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirkosiddi.springboot.backend.apirest.entities.Hero;
import com.mirkosiddi.springboot.backend.apirest.services.IHeroService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class HeroController {

	@Autowired
	private IHeroService heroService;

	@GetMapping("/heroes")
	public List<Hero> index() {
		return heroService.findAll();
	}

	@GetMapping("/heroes/page/{page}")
	public Page<Hero> index(@PathVariable Integer page) {
		PageRequest pageable = PageRequest.of(page - 1, 4);
		return heroService.findAll(pageable);
	}

}
