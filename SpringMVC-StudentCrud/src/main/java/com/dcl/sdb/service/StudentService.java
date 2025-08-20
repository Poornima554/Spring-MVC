package com.dcl.sdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.dcl.sdb.entity.StudentEntity;
import com.dcl.sdb.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public ModelAndView addStudent(StudentEntity st) {
		// Resolving request
		studentRepository.addStudent(st);

		// Generating response
		return new ModelAndView("index.jsp");
	}

	public ModelAndView displayStudent() {
		List<StudentEntity> slist = studentRepository.displayStudent();

		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayStudent.jsp");
		mav.addObject("key", slist);
		return mav;
	}

	public ModelAndView findStudentById(int id) {
		StudentEntity student = studentRepository.findStudentById(id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("findStudent.jsp");
		mav.addObject("key", student);
		return mav;
	}

	public void updateStudent(StudentEntity st) {
		StudentEntity s = new StudentEntity();
		s.setId(st.getId());
		s.setFirstName(st.getFirstName());
		s.setLastName(st.getLastName());
		s.setEmail(st.getEmail());
		s.setPhoneNo(st.getPhoneNo());
		s.setCity(st.getCity());
		
	studentRepository.updateStudent(s);
	}

	public ModelAndView deleteStudent(int studentId) {
		studentRepository.removeStudent(studentId);
		return findAllStudents();
	}

	private ModelAndView findAllStudents() {
		List<StudentEntity> st = studentRepository.findAllAtudents();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayStudent.jsp");
		mav.addObject("key", st);
		return mav;
	}

	public ModelAndView studentInfo(int id) {
		StudentEntity st = studentRepository.findStudentById(id);
		return new ModelAndView("studentInfo.jsp").addObject("info", st);
	}

	public ModelAndView findStudentInfo(int id) {
		StudentEntity student = studentRepository.findStudentById(id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("StudentInfo.jsp");
		mav.addObject("key", student);
		return mav;
	}


}
