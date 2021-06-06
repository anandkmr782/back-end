package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Servlet;
import com.project.learncode.repo.ServletRepo;

@Service
public class ServletService {
	
	@Autowired
	private ServletRepo svr;
	
	public List<Servlet> getServlet()
	{
		return svr.findAll();
	}	

}
