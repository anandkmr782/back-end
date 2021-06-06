package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Sql;
import com.project.learncode.repo.SqlRepo;

@Service
public class SqlService {
	
	@Autowired
	private SqlRepo sqr;
	
	public List<Sql> getSql()
	{
		return sqr.findAll();
	}

}
