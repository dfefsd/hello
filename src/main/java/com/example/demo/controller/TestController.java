package com.example.demo.controller;

import java.io.Console;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.JoinDTO;
import com.example.demo.service.TestService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TestController {
	
	private final TestService testService;
	
	
	@GetMapping("/join")
	public String get() {
		return "join/join";
	}
	
	@PostMapping("/join/new")
	public String join(JoinDTO dto) {
		
		testService.save(dto);
		
		return "join/join";
	}
	
	@GetMapping("/join/list")
	public String list(Model model) {
		testService.list(model);
		return "join/list";
	}
	
	@DeleteMapping("/join/list/{listNo}")
	public String update(@PathVariable(name = "listNo") Long no) {
		testService.delete(no);
		return "redirect:/join/list";
	}
	
	
	
	
}
