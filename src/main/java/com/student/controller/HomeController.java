package com.student.controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.student.model.User;

@Controller
public class HomeController {
	String arr[]= new String[100];

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user( @ModelAttribute("user") User user, ModelMap model,HttpSession session) {
		System.out.println("User Page Requested"+user.getUserName());
		session.setAttribute("userName", user.getUserName());
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser( @ModelAttribute("addUser") User user, ModelMap model,HttpSession session) {
		System.out.println("User Page Requested"+user.getUserName());
		session.setAttribute("userNameList", user.getUserName());
		session.setAttribute("userName", user.getUserName());
		model.addAttribute("userName", user.getUserName());
		return "frame1";
	}
}
