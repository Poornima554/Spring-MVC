package com.dcl.sdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.dcl.sdb.entity.ProfileUrl;
import com.dcl.sdb.entity.StudentEntity;
import com.dcl.sdb.repository.ProfileRepository;
import com.dcl.sdb.repository.StudentRepository;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public ModelAndView displayProfile(int studentId) {
		List<ProfileUrl> profile = studentRepository.findStudentById(studentId).getProfileUrls();
		ModelAndView mav =  new ModelAndView("profileTable.jsp").addObject("profile",profile);
		mav.addObject("sid",studentId);
		return mav;
	}

	public ModelAndView addProfile(ProfileUrl profile, int id) {
		StudentEntity student = studentRepository.findStudentById(id);
		profile.setStudent(student);
		profileRepository.addUrl(profile);
		return displayProfile(id);
	}

	public ModelAndView findProfile(int profileId) {
		ProfileUrl profile = profileRepository.findProfileById(profileId);
		int studentId = profileRepository.findProfileById(profileId).getStudent().getId();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("viewProfileToUpdate.jsp");
		mav.addObject("profileInfo", profile);
		mav.addObject("stid", studentId);
		return mav;
	}

	public ModelAndView updateProfile(ProfileUrl pro, int studentId) {
		pro.setStudent(studentRepository.findStudentById(studentId));
		profileRepository.updateProfile(pro);
		return displayProfile(studentId);
	}


	public ModelAndView deleteProfile(int profileId) {
		int studentId = profileRepository.findProfileById(profileId).getStudent().getId();
		profileRepository.deleteProfile(profileId);
		return displayProfile(studentId);
	}
}
