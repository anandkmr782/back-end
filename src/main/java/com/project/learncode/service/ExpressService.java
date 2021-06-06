package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Express;
import com.project.learncode.repo.ExpressRepo;

@Service
public class ExpressService {
	
	@Autowired
	private ExpressRepo er;
	
	public List<Express> getExpress()
	{
		return er.findAll();
	}
	

}
