package com.springboot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sms.entity.Student;

//dont have to add respository annotation , as jpa repository already has it
// by deafult it also provides transactional annotations.

public interface StudentRepository extends JpaRepository<Student, Long> {

}
