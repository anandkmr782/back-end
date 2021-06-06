package com.project.learncode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.learncode.entity.Node;

public interface NodeRepo extends JpaRepository<Node,Long> {

}
