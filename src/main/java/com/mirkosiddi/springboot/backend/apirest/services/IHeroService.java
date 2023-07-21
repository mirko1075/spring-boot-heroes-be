package com.mirkosiddi.springboot.backend.apirest.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mirkosiddi.springboot.backend.apirest.entities.Hero;

public interface IHeroService {

	public List<Hero> findAll();

	public Page<Hero> findAll(Pageable pageRequest);

	public Hero save(Hero hero);

	public Hero findById(Long id);

	public void delete(Long id);

}
