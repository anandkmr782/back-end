package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Hibernate;
import com.project.learncode.repo.HibernateRepo;

@Service
public class HibernateService {
	
	@Autowired
	private HibernateRepo hr;
	
	public List<Hibernate> getHibernate()
	{
		return hr.findAll();
	}

}
