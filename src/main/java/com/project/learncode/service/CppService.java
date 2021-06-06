package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Cpp;
import com.project.learncode.repo.CppRepo;

@Service
public class CppService {
	
	@Autowired
	private CppRepo cpr;
	
	public List<Cpp> getCpp()
	{
		return cpr.findAll();
	}

}
