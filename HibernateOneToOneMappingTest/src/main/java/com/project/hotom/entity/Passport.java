package com.project.hotom.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Passport {
	@Id
	private long idproof;

	@Column(length = 70, nullable = false)
	private String placeOfBirthString;
	
	private LocalDate dateOfIssueDate;
	private LocalDate expireDate;

	
}
