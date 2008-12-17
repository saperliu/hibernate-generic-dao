package com.test.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "limbed", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class Pet {
	private Long id;
	private Ident ident;
	private String species;
	private Pet favoritePlaymate;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Ident getIdent() {
		return ident;
	}

	public void setIdent(Ident ident) {
		this.ident = ident;
	}

	@ManyToOne
	public Pet getFavoritePlaymate() {
		return favoritePlaymate;
	}

	public void setFavoritePlaymate(Pet favoritePlaymate) {
		this.favoritePlaymate = favoritePlaymate;
	}
}
