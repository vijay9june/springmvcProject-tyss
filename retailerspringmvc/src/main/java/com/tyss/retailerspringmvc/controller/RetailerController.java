package com.tyss.retailerspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import com.tyss.retailerspringmvc.dto.RetailerBean;
import com.tyss.retailerspringmvc.service.RetailerService;

@Controller
public class RetailerController {
	
	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of login page

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		RetailerBean bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}

	}//end of login()

	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of registerPage()

	@PostMapping("/register")
	public String register(RetailerBean bean, ModelMap map) {

		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "You are Register and Your ID is "+check);
		}else {
			map.addAttribute("msg", "Email  alrady taken");
		}

		return "login";
	}//end of register()
	
	@GetMapping("/home")
	public String home(ModelMap map,
			@SessionAttribute(name = "bean", required = false) RetailerBean bean) {
		if(bean==null) {
			map.addAttribute("msg", "Login First!!!!");
			return "login";
		}else {
			return "home";
		}
	}//end of home()
	
	@PostMapping("/home")
	public String home() {
		return "home";
	}//end of home()
	
	@GetMapping("/search")
	public String searchProduct(@RequestParam("id")int id, ModelMap map) {
		RetailerBean bean = service.searchProduct(id);
		if(bean==null) {
			map.addAttribute("msg", "Data Not Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}//end of search()
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout()
	
}
