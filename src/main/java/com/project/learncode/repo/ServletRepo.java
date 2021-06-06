package com.project.learncode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.learncode.entity.Servlet;

public interface ServletRepo extends JpaRepository<Servlet,Long> {

}
