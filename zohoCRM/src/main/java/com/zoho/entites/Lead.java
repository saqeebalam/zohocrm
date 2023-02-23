package com.zoho.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity
@Table(name ="leads")
public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 3,max =10,message = "Size is Should between 3 to 10" )
	@NotBlank(message = "Firsr Name Is Not Null")
	@Column(name = "first_name",nullable = false,length = 10)
	private String firstName;
	
	@Size(min = 3,max =10,message = "Size is Should between 3 to 10" )
	@NotBlank(message = "Last Name Is Not Null")
	@Column(name = "last_name",nullable = false,length = 20)
	private String lastName;
	
	@Email(message = "Only Email Should Be Put")
	@Column(name = "email",nullable = false,length = 128,unique = true)
	private String email;

	@NotBlank(message = "Mobile number should  Not Null")
	@Pattern(regexp="(^$|[0-9]{10})")
	@Column(name = "mobile",nullable = false,length = 10)
	private String mobile;
	
	@NotBlank(message = "Source Is Not Null")
	@Column(name = "source",nullable = false,length = 20)
	private String source;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	
	
}
