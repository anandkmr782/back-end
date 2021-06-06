package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Html;
import com.project.learncode.repo.HtmlRepo;

@Service
public class HtmlService {
	
	@Autowired
	private HtmlRepo sr;	
	
	public List<Html> getHtml()
	{
		return sr.findAll();
	}	

}
