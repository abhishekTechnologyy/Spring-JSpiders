package org.jsp.springMVCpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TestController {

	@RequestMapping(value="/test")
	@ResponseBody
	public String test() {
		return "<h1> This handler method is created to test the Configuration</h1>";

}
	@RequestMapping(value = "/open-home")
	public String openHome() {
		return "home";
	}
	
	@RequestMapping(value = "/open-view")
	public String openView(@RequestParam(name = "view") String view) {
		return view;
	}
	
	@RequestMapping("/sum")
	public String findSum(@RequestParam(name = "n1") int n1,@RequestParam(name = "n2") int n2, Model model) {
		String result = n1 + "+" + n2 + "=" +(n1+n2);
		model.addAttribute("res",result);	
		return "print";
		}
	
	@RequestMapping("/open-register")
	public ModelAndView openRegister() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
		modelAndView.addObject("user", new UserRequest());
		return modelAndView;
	}
	
//	@RequestMapping(method = RequestMethod.POST, value = "/register")
	@PostMapping("/register")
	@ResponseBody
	public String register(@ModelAttribute(name="user") UserRequest request) {
		return request.toString();
	}
}
