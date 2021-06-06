package com.project.learncode.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.learncode.entity.AdvJava;
import com.project.learncode.entity.Android;
import com.project.learncode.entity.C;
import com.project.learncode.entity.CSS;
import com.project.learncode.entity.CoreJava;
import com.project.learncode.entity.Cpp;
import com.project.learncode.entity.Express;
import com.project.learncode.entity.Hibernate;
import com.project.learncode.entity.Html;
import com.project.learncode.entity.MailRequest;
import com.project.learncode.entity.MailResponse;
import com.project.learncode.entity.Node;
import com.project.learncode.entity.Python;
import com.project.learncode.entity.React;
import com.project.learncode.entity.ReactNative;
import com.project.learncode.entity.Servlet;
import com.project.learncode.entity.Spring;
import com.project.learncode.entity.SpringBoot;
import com.project.learncode.entity.Sql;
import com.project.learncode.entity.Vanila;
import com.project.learncode.service.AdvJavaService;
import com.project.learncode.service.AndroidService;
import com.project.learncode.service.CSSService;
import com.project.learncode.service.CService;
import com.project.learncode.service.CoreJavaService;
import com.project.learncode.service.CppService;
import com.project.learncode.service.ExpressService;
import com.project.learncode.service.HibernateService;
import com.project.learncode.service.HtmlService;
import com.project.learncode.service.MailService;
import com.project.learncode.service.NodeService;
import com.project.learncode.service.PythonService;
import com.project.learncode.service.ReactNativeService;
import com.project.learncode.service.ReactService;
import com.project.learncode.service.ServletService;
import com.project.learncode.service.SpringBootService;
import com.project.learncode.service.SpringService;
import com.project.learncode.service.SqlService;
import com.project.learncode.service.VanilaService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class HtmlController {
	
	@Autowired
	private HtmlService hts;
	@Autowired
	private CSSService css;
	@Autowired
	private VanilaService vs;
	@Autowired
	private ReactService rs;
	@Autowired
	private NodeService ns;
	@Autowired
	private ExpressService es;
	@Autowired
	private ReactNativeService rns;
	@Autowired
	private CoreJavaService cjs;
	@Autowired
	private AdvJavaService ajs;
	@Autowired
	private ServletService svs;
	@Autowired
	private SpringService sps;
	@Autowired
	private SpringBootService sbs;
	@Autowired
	private HibernateService hs;
	@Autowired
	private AndroidService as;
	@Autowired
	private PythonService ps;
	@Autowired
	private CService cs;
	@Autowired
	private CppService cps;
	@Autowired
	private SqlService sqs;
	@Autowired
	private MailService service;
	

	@PostMapping("/sending")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("location", "Bihar,India");
		return service.sendEmail(request, model);

	}
	
	
	@GetMapping("/getHtml")//correct
	public List<Html> getHtml()
	{
		return this.hts.getHtml();
	}
	@GetMapping("/getCss")
	public List<CSS> getCss()
	{
		return this.css.getCss();
	}
	@GetMapping("/getVanila")
	public List<Vanila> getVanila()
	{
		return this.vs.getVanila();
	}
	@GetMapping("/getReact")
	public List<React> getReact()
	{
		return this.rs.getReact();
	}
	@GetMapping("/getNode")
	public List<Node> getNode()
	{
		return this.ns.getNode();
	}
	@GetMapping("/getExpress")
	public List<Express> getExpress()
	{
		return es.getExpress();
	}
	@GetMapping("/getReactNative")
	public List<ReactNative> getReactNative()
	{
		return this.rns.getReactNative();
	}
	@GetMapping("/getCoreJava")
	public List<CoreJava> getCoreJava()
	{
		return this.cjs.getCoreJava();
	}
	@GetMapping("/getAdvJava")
	public List<AdvJava> getAdvJava()
	{
		return this.ajs.getAdvJava();
	}
	@GetMapping("/getServlet")
	public List<Servlet> getServlet()
	{
		return this.svs.getServlet();
	}
	@GetMapping("/getSpring")
	public List<Spring> getSpring()
	{
		return this.sps.getSpring();
	}
	@GetMapping("/getSpringBoot")
	public List<SpringBoot> getSpringBoot()
	{
		return this.sbs.getSpringBoot();
	}
	@GetMapping("/getHibernate")
	public List<Hibernate> getHibernate()
	{
		return this.hs.getHibernate();
	}
	@GetMapping("/getAndroid")
	public List<Android> getAndroid()
	{
		return this.as.getAndroid();
	}
	@GetMapping("/getPython")
	public List<Python> getPython()
	{
		return this.ps.getPython();
	}
	@GetMapping("/getC")
	public List<C> getC()
	{
		return this.cs.getC();
	}
	@GetMapping("/getCpp")
	public List<Cpp> getCpp()
	{
		return this.cps.getCpp();
	}
	@GetMapping("/getSql")
	public List<Sql> getSql()
	{
		return this.sqs.getSql();
	}

}
