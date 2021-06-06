package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Python;
import com.project.learncode.repo.PythonRepo;

@Service
public class PythonService {
	
	@Autowired
	private PythonRepo pr;
	
	public List<Python> getPython()
	{
		return pr.findAll();
	}

}
