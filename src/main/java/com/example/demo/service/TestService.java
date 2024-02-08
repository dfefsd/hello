package com.example.demo.service;

import org.springframework.ui.Model;

import com.example.demo.domain.JoinDTO;

public interface TestService {

	void save(JoinDTO dto);

	void list(Model model);

	void delete(Long no);


	

}
