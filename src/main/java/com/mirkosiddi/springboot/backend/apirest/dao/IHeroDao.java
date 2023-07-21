package com.mirkosiddi.springboot.backend.apirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirkosiddi.springboot.backend.apirest.entities.Hero;

public interface IHeroDao extends JpaRepository<Hero, Long> {

}
