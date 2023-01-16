package com.example.demo.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable>{

	public Student getByName(String name);
}
