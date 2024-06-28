package org.jsp.employeeWebApp.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	private EntityManager entityManager;

	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return entityManager.toString();
	}
}
