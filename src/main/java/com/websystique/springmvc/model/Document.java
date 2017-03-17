package com.websystique.springmvc.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Document implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="name",length=100,nullable=false)
	private String name ;
	
	
	@Column(name="description",length=250,nullable=false)
	private String description;
	
	
	
	@Column(name="type",length=100,nullable=false)
	private String type ;
	
	
	@Lob @Basic(fetch=FetchType.LAZY)
	@Column(name="content",nullable=false)
	private byte[] content;
	
	@JsonManagedReference
	@ManyToOne(optional=false)
	@JoinColumn(name="USER_ID")
	private User user;


	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public byte[] getContent() {
		return content;
	}


	public void setContent(byte[] content) {
		this.content = content;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	

}
