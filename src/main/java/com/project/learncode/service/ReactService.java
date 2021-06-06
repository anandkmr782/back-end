package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.React;
import com.project.learncode.repo.ReactRepo;

@Service
public class ReactService {
	
	@Autowired
	private ReactRepo rr;
	
	public List<React> getReact()
	{
		return rr.findAll();
	}

}
