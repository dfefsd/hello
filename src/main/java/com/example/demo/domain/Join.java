package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
@Entity
public class Join {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long no;
	private String email;
	private String pass;
	
}
