package com.websystique.springmvc.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="APP_USER")
public class User implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Column(name="SSO_ID", unique=true, nullable=false)
	private String ssoId;
	
	@NotEmpty
	@Column(name="PASSWORD", nullable=false)
	private String password;
		
	@NotEmpty
	@Column(name="FIRST_NAME", nullable=false)
	private String firstName;

	@NotEmpty
	@Column(name="LAST_NAME", nullable=false)
	private String lastName;

	@NotEmpty
	@Column(name="EMAIL", nullable=false)
	private String email;

	@JsonManagedReference
	@NotEmpty
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "APP_USER_USER_PROFILE", 
             joinColumns = { @JoinColumn(name = "USER_ID") }, 
             inverseJoinColumns = { @JoinColumn(name = "USER_PROFILE_ID") }) 
	private Set<UserProfile> userProfiles = new HashSet<UserProfile>(); 
	
	
	@JsonBackReference
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER)
	private Set<Account> accounts;
	
	
	@JsonBackReference
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private Set<UserDocument> userDocuments = new HashSet<UserDocument>();
	
	@JsonBackReference
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Car> cars = new HashSet<Car>();
	
	@JsonBackReference
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Document> documents = new HashSet<Document>();

	
	
	
	public User(){
		
	}
	
	

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSsoId() {
		return ssoId;
	}

	public void setSsoId(String ssoId) {
		this.ssoId = ssoId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<UserProfile> getUserProfiles() {
		return userProfiles;
	}

	public void setUserProfiles(Set<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}
	

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	
	

	public Set<UserDocument> getUserDocuments() {
		return userDocuments;
	}

	public void setUserDocuments(Set<UserDocument> userDocuments) {
		this.userDocuments = userDocuments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ssoId == null) ? 0 : ssoId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ssoId == null) {
			if (other.ssoId != null)
				return false;
		} else if (!ssoId.equals(other.ssoId))
			return false;
		return true;
	}

	
	

	





	public Set<Car> getCars() {
		return cars;
	}

	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	public Set<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	
	
	@Override
    public String toString() {
        return "User [id=" + id + ", ssoId=" + ssoId + ", password=" + password
                + ", firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + "]";
    }

	
}
