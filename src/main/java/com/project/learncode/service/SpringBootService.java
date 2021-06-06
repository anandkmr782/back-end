package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.SpringBoot;
import com.project.learncode.repo.SpringBootRepo;

@Service
public class SpringBootService {
	
	@Autowired
	private SpringBootRepo sbr;
	
	public List<SpringBoot> getSpringBoot()
	{
		return sbr.findAll();
	}

}
