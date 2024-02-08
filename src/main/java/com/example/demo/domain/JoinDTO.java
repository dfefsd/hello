package com.example.demo.domain;

import org.checkerframework.checker.lock.qual.NewObject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JoinDTO {

	private long no;
	private String email;
	private String pass;

}
