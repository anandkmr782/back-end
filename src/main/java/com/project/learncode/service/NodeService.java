package com.project.learncode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.learncode.entity.Node;
import com.project.learncode.repo.NodeRepo;

@Service
public class NodeService {
	
	@Autowired
	private NodeRepo nr;
	
	public List<Node> getNode()
	{
		return nr.findAll();
	}

}
