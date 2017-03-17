package com.websystique.springmvc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
public class Car implements Serializable {

	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	
	@NotEmpty
	private String libelle;
	
	
	@NotEmpty
	private String registration ;
	
	@JsonManagedReference
	@NotNull
	@ManyToOne(optional=false)
	@JoinColumn(name="user_fk")
	private User user;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Car [id=" +id + ", libelle=" + libelle + ", registration=" + registration +  "]";
	}
	
	
	public Car(){
		
	}
	
	
}
