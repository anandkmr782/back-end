package com.project.learncode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.learncode.entity.Sql;

public interface SqlRepo extends JpaRepository<Sql,Long>{

}
