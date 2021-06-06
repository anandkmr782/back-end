package com.project.learncode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.learncode.entity.Html;

public interface HtmlRepo extends JpaRepository<Html,Long> {
	

}
