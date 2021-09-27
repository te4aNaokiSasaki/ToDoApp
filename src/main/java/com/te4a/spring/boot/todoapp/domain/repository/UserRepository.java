package com.te4a.spring.boot.todoapp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.te4a.spring.boot.todoapp.domain.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
