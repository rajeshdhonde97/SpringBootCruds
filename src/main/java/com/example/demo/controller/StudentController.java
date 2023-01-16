package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/studinfo")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public Student saveStudentData( @RequestBody Student student) {
		return studentService.saveStudentData(student);
	}

	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudentData(Student stud,@PathVariable int id) {
		return studentService.updateStudentData(stud, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudentData(@PathVariable int id) {
		studentService.deleteStudentData(id);
	}
	
	@GetMapping("/get/{id}")
	public Optional<Student> getById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("getname/{firstname}")
	public Student getStudentByName(@PathVariable String firstname) {
		return studentService.getStudentByName(firstname);
	}
}
