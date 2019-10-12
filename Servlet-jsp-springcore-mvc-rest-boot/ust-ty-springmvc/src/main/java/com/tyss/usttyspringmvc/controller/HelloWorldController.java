package com.tyss.usttyspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tyss.usttyspringmvc.dto.Employee;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("YYYY-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
		
	}
	
	@RequestMapping(path = "/world", method = RequestMethod.GET)
	public String hello(ModelMap map) {
		map.addAttribute("msg", "Hello Darshan!!!!!!!!!!!!!!!!!!");
		return "index";
	}
	@RequestMapping(path = "/query", method = RequestMethod.GET)
	public String getInfo(@RequestParam("name") String name,@RequestParam("id") int id,ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("id",id);
		return "info";
	}
	@RequestMapping(path = "/form-page",method = RequestMethod.GET)
	public String getForm() {
		return "form";
	}
@RequestMapping(path="/form" ,method = RequestMethod.POST)
	public String formData(Employee emp,ModelMap map) {
	map.addAttribute("name",emp.getName());	
	map.addAttribute("id", emp.getId());
	map.addAttribute("email", emp.getEmail());
	map.addAttribute("dob", emp.getDob());
	map.addAttribute("password", emp.getPassword());
	return "info";
	}
@RequestMapping(path = "/add-cookie" ,method = RequestMethod.GET)
public String addCookie(HttpServletResponse response,ModelMap map) {
	Cookie cookie=new Cookie("name","kkkkk");
	response.addCookie(cookie);
	map.addAttribute("msg", "Cookie added to the browser");
	return "cookie";
}
@RequestMapping(path ="/get-cookie" ,method = RequestMethod.GET)
public String getCookie(ModelMap map,@CookieValue(name="name",required=false) String name) {
	if(name==null) {
		map.addAttribute("msg", "cookie not present");
	}else {
		
		map.addAttribute("msg","Cookie value ="+ name);
	}
	return "cookie";
}

@RequestMapping(path = "/path/{id}/{name}/{email}",method = RequestMethod.GET)
public String getPathValue(@PathVariable("email")String email,@PathVariable("id")int id,@PathVariable("name")String name,ModelMap map){
	map.addAttribute("name", name);
	map.addAttribute("id", id);
	map.addAttribute("email", email);
	return "info";
}

@RequestMapping(path = "/set-attribute",method = RequestMethod.GET)
public String sessionAttribute(HttpSession session,ModelMap map) {
	Employee employee=new Employee();
	employee.setEmail("krantikarale@gamil.com");
	employee.setId(1);
	employee.setName("kranti");
	employee.setPassword("aksdhsjkdh");
	session.setAttribute("emp", employee);
	map.addAttribute("msg", "session attribute added");
	return "index";
	
}

@RequestMapping(path = "/get-attribute",method = RequestMethod.GET)
public String getSession(@SessionAttribute(name="emp",required=false)Employee employee,ModelMap map) {
	if(employee==null) {
		map.addAttribute("msg", "no  attributte present");
	}else {
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		map.addAttribute("msg", "got the attributte");
	}
	return "index";
}

@RequestMapping(path = "/forward",method = RequestMethod.GET)
public String forward() {
	return "forward:add-cookie";       //forward to add-cookie as add-cookie is not jsp file 
}

@RequestMapping(path = "/redirect",method = RequestMethod.GET)
public String redirect() {
	return "redirect:http://www.google.com";       //redirect to google 
}
}
