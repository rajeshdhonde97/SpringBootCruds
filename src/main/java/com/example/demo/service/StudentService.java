package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentService {
	
	//save student data
	public Student saveStudentData(Student student);
	
	//get all student data
	public List<Student> getAllStudent();
	
	//update student data
	public Student updateStudentData(Student stud, int id);
	
	//delete student data
	public void deleteStudentData(int id);
	
	//get student data by id
	public Optional<Student> getStudentById(int id);
	
	//get Student By Name
	public Student getStudentByName(String firstname);

}
