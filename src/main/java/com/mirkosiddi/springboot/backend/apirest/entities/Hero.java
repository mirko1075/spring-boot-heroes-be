package com.mirkosiddi.springboot.backend.apirest.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.NumberFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "heroes")
public class Hero implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(min = 4, max = 12)
	private String name;

	@NotEmpty
	private String description;

	@NotEmpty
	private String imageName;

	@NumberFormat
	private Long intelligence;

	@NumberFormat
	private Long strength;

	@NumberFormat
	private Long speed;

	@NumberFormat
	private Long durabilityLong;

	@NumberFormat
	private Long power;

	@NumberFormat
	private Long combat;

	@NotNull(message = "Date cannot be null")
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Long getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Long intelligence) {
		this.intelligence = intelligence;
	}

	public Long getStrength() {
		return strength;
	}

	public void setStrength(Long strength) {
		this.strength = strength;
	}

	public Long getSpeed() {
		return speed;
	}

	public void setSpeed(Long speed) {
		this.speed = speed;
	}

	public Long getDurabilityLong() {
		return durabilityLong;
	}

	public void setDurabilityLong(Long durabilityLong) {
		this.durabilityLong = durabilityLong;
	}

	public Long getPower() {
		return power;
	}

	public void setPower(Long power) {
		this.power = power;
	}

	public Long getCombat() {
		return combat;
	}

	public void setCombat(Long combat) {
		this.combat = combat;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
