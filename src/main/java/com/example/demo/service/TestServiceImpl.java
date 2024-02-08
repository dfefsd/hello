package com.example.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.domain.Join;
import com.example.demo.domain.JoinDTO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

	private final TestRepository testRepository;
	
	@Override
	public void save(JoinDTO dto) {

		Join join = Join.builder()
						.email(dto.getEmail())
						.pass(dto.getPass())
						.build();
		
		testRepository.save(join);
	}

	@Override
	public void list(Model model) {

		List<JoinDTO> dto = testRepository.findAll().stream()
				.map(join -> JoinDTO.builder()
						.email(join.getEmail())
						.pass(join.getPass())
						.no(join.getNo())
						.build())
				.collect(Collectors.toList());
		
		model.addAttribute("list",dto);
		
		System.out.println(">>>>>>>>>>>>>"+dto);
		
	}

	@Override
	public void delete(Long no) {
		testRepository.deleteById(no);
		
	}
	

	

}
