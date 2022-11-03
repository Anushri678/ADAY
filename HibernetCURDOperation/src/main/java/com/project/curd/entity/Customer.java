package com.project.curd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "Customer_Details")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column(length = 30, nullable = false)
	@NotBlank(message = "customer name can not be blank")
	@Min(value = 3)
	private String nameString;
	@Column(length = 30, nullable = false)
	@NotBlank(message = "customer email can not be blank")
	private String emailString;
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "customer mobile numbercan not be blank")
	@Min(value = 10)
	private long mobile;
}
