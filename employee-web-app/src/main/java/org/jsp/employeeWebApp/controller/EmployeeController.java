package org.jsp.employeeWebApp.controller;

import org.jsp.employeeWebApp.dao.EmployeeDao;
import org.jsp.employeeWebApp.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping("/open-register")
	public ModelAndView openRegister(ModelAndView modelAndView) {
		modelAndView.setViewName("register");
		modelAndView.addObject("emp", new Employee());
		return modelAndView;
	}

	@PostMapping(value = "/save")
	@ResponseBody
	public String saveEmployee(@ModelAttribute(name = "emp") Employee employee) {
		employee = employeeDao.saveEmployee(employee);
		return "<h2>Employee saved with Id:" + employee.getId() + "</h2>";
	}
	
	@RequestMapping("/open-update")
	public ModelAndView openUpdate(ModelAndView modelAndView) {
		modelAndView.setViewName("update");
		modelAndView.addObject("emp", new Employee());
		return modelAndView;
	}

	@PostMapping(value = "/update")
	@ResponseBody
	public String updateEmployee(@ModelAttribute(name = "emp") Employee employee) {
		employee = employeeDao.updateEmployee(employee);
		if (employee != null)
			return "<h2>Employee with Id:" + employee.getId() + " updated</h2>";
		else
			return "<h2>Cannot Update Employee as Id is Invalid</h2>";
	}

	@RequestMapping("/open-view")
	public String openView(@RequestParam String view) {
		return view;
	}

	@PostMapping("/verify-by-phone")
	public ModelAndView verify(@RequestParam(name = "phone") long phone,
			@RequestParam(name = "password") String password) {

		Employee employee = employeeDao.verify(phone, password);
		ModelAndView modelAndView = new ModelAndView();
		if (employee != null) {
			modelAndView.setViewName("display");
			modelAndView.addObject("employee", employee);
			return modelAndView;
		}
		modelAndView.setViewName("error");
		modelAndView.addObject("message", "Invalid Phone number or Password");
		return modelAndView;
	}

	@PostMapping("/verify-by-email")
	public ModelAndView verify(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		Employee employee = employeeDao.verify(email, password);
		ModelAndView modelAndView = new ModelAndView();
		if (employee != null) {
			modelAndView.setViewName("display");
			modelAndView.addObject("employee", employee);
			return modelAndView;
		}
		modelAndView.setViewName("error");
		modelAndView.addObject("message", "Invalid Email Id or Password");
		return modelAndView;
	}

	@PostMapping("/verify-by-id")
	public ModelAndView verify(@RequestParam(name = "id") int id, @RequestParam(name = "password") String password) {
		Employee employee = employeeDao.verify(id, password);
		ModelAndView modelAndView = new ModelAndView();
		if (employee != null) {
			modelAndView.setViewName("display");
			modelAndView.addObject("employee", employee);
			return modelAndView;
		}
		modelAndView.setViewName("error");
		modelAndView.addObject("message", "Invalid Employee Id or Password");
		return modelAndView;
	}

	@GetMapping("/find-by-id")
	public ModelAndView findById(@RequestParam int id) {
		Employee employee = employeeDao.findById(id);
		ModelAndView modelAndView = new ModelAndView();
		if (employee != null) {
			modelAndView.setViewName("display");
			modelAndView.addObject("employee", employee);
			return modelAndView;
		}
		modelAndView.setViewName("error");
		modelAndView.addObject("message", "Invalid Employee Id");
		return modelAndView;
	}

	@RequestMapping("/delete-by-id")
	@ResponseBody
	public String deleteById(@RequestParam int id) {
		boolean deleted = employeeDao.deleteById(id);
		if (deleted)
			return "Employee with Id:" + id + " deleted";
		else
			return "Cannot delete Employee as Id is Invalid";
	}
}
