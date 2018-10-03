package com.sba6.srm.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="employee")
public @Data class Employee {
	
	@Id @GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="MGR_ID")
	private Long mgrId;
	
	@Column(name="DESIGNATION")
	private String designation;
	
	@Column(name="DEPARTMENT")
	private String department;
	
	@Lob
	@Column(name="IMG")
	private byte[] img;
	
	@OneToOne(mappedBy="employee")
	private LoginDetail loginDetail;
	
	@OneToOne(mappedBy="employee")
	private Request request;
	
}
