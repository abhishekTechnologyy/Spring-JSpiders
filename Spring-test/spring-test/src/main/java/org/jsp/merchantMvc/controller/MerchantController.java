package org.jsp.merchantMvc.controller;

import org.jsp.merchantMvc.dao.MerchantDao;
import org.jsp.merchantMvc.dto.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MerchantController {

	@Autowired
	private MerchantDao merchantDao;

	@RequestMapping("/open-register")
	public ModelAndView openRegister(ModelAndView modelAndView) {
		modelAndView.setViewName("register");
		modelAndView.addObject("merchant", new Merchant());
		return modelAndView;
	}

	@PostMapping(value = "/save")
	@ResponseBody
	public String saveMerchant(@ModelAttribute(name = "merchant") Merchant merchant) {
		merchant = merchantDao.saveMerchant(merchant);
		return "<h2>merchant saved with Id:" + merchant.getId() + "</h2>";
	}

	@RequestMapping("/open-update")
	public ModelAndView openUpdate(ModelAndView modelAndView) {
		modelAndView.setViewName("update");
		modelAndView.addObject("merchant", new Merchant());
		return modelAndView;
	}

	@PostMapping(value = "/update")
	@ResponseBody
	public String updateMerchant(@ModelAttribute(name = "merchant") Merchant merchant) {
		merchant = merchantDao.updateMerchant(merchant);
		if (merchant != null)
			return "<h2>merchant with Id:" + merchant.getId() + " updated</h2>";
		else
			return "<h2>Cannot Update merchant as Id is Invalid</h2>";
	}

	@RequestMapping("/open-view")
	public String openView(@RequestParam String view) {
		return view;
	}

	@PostMapping("/verify-by-phone")
	public ModelAndView verify(@RequestParam(name = "phone") long phone,
			@RequestParam(name = "password") String password) {
		Merchant merchant = merchantDao.verify(phone, password);
		ModelAndView modelAndView = new ModelAndView();
		if (merchant != null) {
			modelAndView.setViewName("display");
			modelAndView.addObject("merchant", merchant);
			return modelAndView;
		}
		modelAndView.setViewName("error");
		modelAndView.addObject("message", "Invalid Phone Number or Password");
		return modelAndView;
	}

	@PostMapping("/verify-by-email")
	public ModelAndView verify(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		Merchant merchant = merchantDao.verify(email, password);
		ModelAndView modelAndView = new ModelAndView();
		if (merchant != null) {
			modelAndView.setViewName("display");
			modelAndView.addObject("merchant", merchant);
			return modelAndView;
		}
		modelAndView.setViewName("error");
		modelAndView.addObject("message", "Invalid Email Id or Password");
		return modelAndView;
	}

}
