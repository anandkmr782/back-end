package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.CSS;
import com.project.learncode.repo.CSSRepo;

@Service
public class CSSService {
	@Autowired
	private CSSRepo cr;
	
	public List<CSS> getCss()
	{
		return cr.findAll();
	}

}
