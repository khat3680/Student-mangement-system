package com.springboot.sms.service;

import java.util.List;

import com.springboot.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);
}
