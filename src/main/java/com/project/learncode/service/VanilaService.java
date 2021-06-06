package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Vanila;
import com.project.learncode.repo.VanilaRepo;

@Service
public class VanilaService {
	
	@Autowired
	private VanilaRepo vr;
	
	public List<Vanila> getVanila()
	{
		return vr.findAll();
	}

}
