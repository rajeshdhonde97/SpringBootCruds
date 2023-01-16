package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudentData(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	
	@Override
	public Student updateStudentData(Student stud, int id) {
		// TODO Auto-generated method stub
		 Student student=studentRepository.findById(id).orElseThrow(()-> new RuntimeException());
		 student.setFirstname(stud.getFirstname());
		 student.setLastname(stud.getLastname());
		 student.setCity(stud.getCity());
		 studentRepository.save(student);
		 return student;
	}
	
	@Override
	public void deleteStudentData(int id) {
		// TODO Auto-generated method stub
		 studentRepository.findById(id);
		  studentRepository.deleteById(id);
	}
	
	@Override
	public Optional<Student> getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}
	
	@Override
	public Student getStudentByName(String firstname) {
		// TODO Auto-generated method stub
		return studentRepository.getByName(firstname);
	}

}
