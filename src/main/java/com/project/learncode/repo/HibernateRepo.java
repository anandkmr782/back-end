package com.project.learncode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.learncode.entity.Hibernate;

public interface HibernateRepo extends JpaRepository<Hibernate,Long>{

}
