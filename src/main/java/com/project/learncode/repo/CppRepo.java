package com.project.learncode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.learncode.entity.Cpp;

public interface CppRepo extends JpaRepository<Cpp,Long> {

}
