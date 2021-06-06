package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.CoreJava;
import com.project.learncode.repo.CoreJavaRepo;

@Service
public class CoreJavaService {
	@Autowired
	private CoreJavaRepo cjr;
	
	public List<CoreJava> getCoreJava()
	{
		return cjr.findAll();
	}

}
