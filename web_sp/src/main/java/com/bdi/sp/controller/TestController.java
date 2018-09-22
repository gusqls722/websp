package com.bdi.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bdi.sp.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService ts;
	public TestController() {
		System.out.println("나 호출!!");
	}
	
	@RequestMapping(value="/test/*", method= RequestMethod.GET)
	public String get(Model m) {
		m.addAttribute("T",ts.getList());
		return "test/test";
	}
	
	@RequestMapping(value="/test/*", method= RequestMethod.POST)
	public String post(Model m) {
		m.addAttribute("T","난 포스트");
		return "test/test";
	}
	
	
}
