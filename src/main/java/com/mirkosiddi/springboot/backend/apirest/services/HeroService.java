package com.mirkosiddi.springboot.backend.apirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.mirkosiddi.springboot.backend.apirest.dao.IHeroDao;
import com.mirkosiddi.springboot.backend.apirest.entities.Hero;

public class HeroService implements IHeroService {

	@Autowired
	private IHeroDao heroDao;

	@Override
	@Transactional(readOnly = true)
	public List<Hero> findAll() {
		return heroDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Hero> findAll(Pageable pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Hero save(Hero hero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Hero findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
