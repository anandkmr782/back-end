package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.C;
import com.project.learncode.repo.CRepo;

@Service
public class CService {
	
	@Autowired
	private CRepo cr;
	
	public List<C>getC()
	{
		return cr.findAll();
	}

}
