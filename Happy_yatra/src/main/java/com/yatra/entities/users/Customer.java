package com.yatra.entities.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
@Id
private String email;
    private String name;
	private String password;
	//private Bus bus;
	private int price_pr_km;
	
	
}
