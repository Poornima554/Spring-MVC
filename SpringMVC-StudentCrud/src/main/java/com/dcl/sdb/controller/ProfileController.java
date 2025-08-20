package com.dcl.sdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dcl.sdb.entity.ProfileUrl;
import com.dcl.sdb.service.ProfileService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@RequestMapping(value = "/find-all-profiles", method = RequestMethod.GET)
	public ModelAndView viewProfile(int studentId) {
		return profileService.displayProfile(studentId);
	}
	
	@RequestMapping(value = "/addProfile", method = RequestMethod.POST)
	public ModelAndView addProfile(ProfileUrl profile, int id) {
		return profileService.addProfile(profile,id);
	}
	
	@RequestMapping(value = "/findProfile", method = RequestMethod.GET)
	public ModelAndView findProfile(int profileId) {
		return profileService.findProfile(profileId);
	}
	
	@RequestMapping(value = "/updateProfile")
	public ModelAndView updateProfile(ProfileUrl pro, int studentId) {
		return profileService.updateProfile(pro, studentId);
		
	}
	
	@RequestMapping(value = "/deleteProfile", method = RequestMethod.GET)
	public ModelAndView deleteProfile(int profileId) {
		return profileService.deleteProfile(profileId);
	}
	
}
