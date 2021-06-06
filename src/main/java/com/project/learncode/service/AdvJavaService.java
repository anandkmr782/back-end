package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.AdvJava;
import com.project.learncode.repo.AdvJavaRepo;

@Service
public class AdvJavaService {
	@Autowired
	private AdvJavaRepo ajr;
	
	public List<AdvJava> getAdvJava()
	{
		return ajr.findAll();
	}

}
