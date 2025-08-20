package com.dcl.sdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dcl.sdb.entity.StudentEntity;
import com.dcl.sdb.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(StudentEntity student) {
		return studentService.addStudent(student);
	}
	
	@RequestMapping(value = "/displayStudent", method = RequestMethod.GET)
	public ModelAndView displayStudent() {
		return studentService.displayStudent();
	}
	
	@RequestMapping(value = "/find-by-id", method = RequestMethod.GET)
	public ModelAndView findStudentById(int studentId) {
		return studentService.findStudentById(studentId);
	}
	
	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public ModelAndView updateStudent(StudentEntity st) {
		studentService.updateStudent(st);
		return studentService.displayStudent();
	}
	
	@RequestMapping(value = "/delete-by-id", method = RequestMethod.GET)
	public ModelAndView deleteStudent(int studentId) {
		return studentService.deleteStudent(studentId);
	}
	
	
	@RequestMapping(value = "/Student-info", method = RequestMethod.GET)
	public ModelAndView studentInfo(int id) {
		return studentService.findStudentInfo(id);
	}
	
}
