package com.avinash.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avinash.model.Student;
import com.avinash.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(value="/student", method=RequestMethod.POST)
	public String processStudentInfo(@Valid @RequestBody Student student) {
		return studentService.processStudentInfo(student);
	}
}
