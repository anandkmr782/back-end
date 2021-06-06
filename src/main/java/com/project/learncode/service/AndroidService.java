package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Android;
import com.project.learncode.repo.AndroidRepo;

@Service
public class AndroidService {
	
	@Autowired
	private AndroidRepo ar;
	
	public List<Android>getAndroid()
	{
		return ar.findAll();
	}

}
