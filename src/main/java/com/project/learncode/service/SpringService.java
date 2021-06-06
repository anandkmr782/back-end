package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Spring;
import com.project.learncode.repo.SpringRepo;

@Service
public class SpringService {
	
	@Autowired
	private SpringRepo spr;
	
	public List<Spring> getSpring()
	{
		return spr.findAll();
	}

}
