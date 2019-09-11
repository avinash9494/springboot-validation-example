package com.avinash.service;

import org.springframework.stereotype.Service;

import com.avinash.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	public String processStudentInfo(Student student) {
		return "Student Information is valid";
	}
}
