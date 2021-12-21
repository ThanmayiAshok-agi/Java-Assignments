package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	
	public List<Student> getAllStudent()
	{
		return repository.findAll();
	}
	public void saveStudent(Student s)
	{
		repository.save(s);
	}
	
	public void deleteStudent(String id)
	{
		repository.deleteById(id);
    }
	public Optional<Student> findById(String id) {
		return repository.findById(id);
	}
	public void updateStudent(Student stu,String id)
	{
	repository.getById(id);
	repository.save(stu);
	}
}
