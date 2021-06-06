package com.project.learncode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/content")
public class ContentController {
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/html")
	public String html()
	{
		return "html";
	}
	@RequestMapping("/advjava")
	public String advjava()
	{
		return "advjava";
	}
	@RequestMapping("/android")
	public String android()
	{
		return "android";
	}
	@RequestMapping("/c")
	public String c()
	{
		return "c";
	}
	@RequestMapping("/cpp")
	public String cpp()
	{
		return "cpp";
	}
	@RequestMapping("/css")
	public String css()
	{
		return "css";
	}
	@RequestMapping("/java")
	public String java()
	{
		return "java";
	}
	@RequestMapping("/javascript")
	public String javascript()
	{
		return "javascript";
	}
	@RequestMapping("/python")
	public String python()
	{
		return "python";
	}
	@RequestMapping("/reactj")
	public String reactj()
	{
		return "reactj";
	}
	@RequestMapping("/sql")
	public String sql()
	{
		return "sql";
	}

}
