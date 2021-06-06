package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.ReactNative;
import com.project.learncode.repo.ReactNativeRepo;

@Service
public class ReactNativeService {
	@Autowired
	private ReactNativeRepo rnr;
	
	public List<ReactNative> getReactNative()
	{
		return rnr.findAll();
	}

}
