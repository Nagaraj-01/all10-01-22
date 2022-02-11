package com.Lombok;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue
	 private int id;
	private	 String fname;
	private	String lname;
	String gmail;
	

}
