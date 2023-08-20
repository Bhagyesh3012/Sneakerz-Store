package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;//all specs Java EE supplied

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user") // to specify table name
//lombok annotations
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class User extends BaseEntity {

	@Column(name = "User_name", length = 20) // varchar(20)
	private String userName;

	@Column(length = 30, unique = true) // unique constraint
	private String userEmail;
	
	@Column(length = 20, nullable = false) // NOT NULL constraint
	private String userPassword;
	
	private String address;
	
	

}
