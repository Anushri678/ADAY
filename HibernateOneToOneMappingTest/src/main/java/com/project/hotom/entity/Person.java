package com.project.hotom.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Data;


@Data
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@Column(length = 30, nullable = false)
	@NotBlank(message = "person name can not be blank")
	@Min(value = 3)
	private String nameString;
	@Column(length = 30, nullable = false)
	@NotBlank(message = "person email can not be blank")
	private String emailString;
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "perason mobile number can not be blank")
	@Min(value = 10)
	private long mobile;
	
@OneToOne(targetEntity = Passport.class, cascade = CascadeType.ALL)
private Passport passport;
}
