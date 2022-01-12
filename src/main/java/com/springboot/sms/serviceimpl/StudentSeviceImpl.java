package com.springboot.sms.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sms.entity.Student;
import com.springboot.sms.repository.StudentRepository;
import com.springboot.sms.service.StudentService;

@Service
public class StudentSeviceImpl implements StudentService {

	// we can avoid use auto add anotation since this spring bean only has one
	// construtor.

	private StudentRepository studentRespositroy;

	public StudentSeviceImpl(StudentRepository studentRespositroy) {
		super();
		this.studentRespositroy = studentRespositroy;
	}
	@Override
	public List<Student> getAllStudents() {

		return studentRespositroy.findAll();
	}


	public Student saveStudent(Student student) {

		return studentRespositroy.save(student);
	}

}
