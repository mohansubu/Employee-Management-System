package com.example.demo.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Repo.Employeerepo;
import com.example.demo.model.Registration;
@Controller
public class employeecontroller {
	
	@Autowired
	Employeerepo regis;
	
	@RequestMapping("/")
	public String reg() {
		return "home.jsp";
	}
	
	@RequestMapping("/hh")
	public String hh() {
		return "home.jsp";
	}
	
	@RequestMapping(value="/create")
	public String create(@RequestParam Long e_id,
			@RequestParam String first_name,
			@RequestParam String last_name,
			@RequestParam String designation,
			@RequestParam String qualification,
			@RequestParam int salary,
			@RequestParam String dob,
			@RequestParam String blood_group,
			@RequestParam String age,
			@RequestParam String gender,
			@RequestParam String address,
			@RequestParam String phone_number,
			@RequestParam String email) {
		Optional<Registration> r6=regis.findById(e_id);
		if (r6.isPresent()) {
			return "notcreated.jsp";
		}
		else
		{
		Registration  r = new Registration(e_id,first_name,last_name,designation,qualification,salary,dob,blood_group,age,gender,address,phone_number,email);
		regis.save(r);
		return "created.jsp";
		}
	}
	
	@RequestMapping(value="/cre")
	public String cre()
	{
		return "create.jsp";
	}
		
	@RequestMapping(value="/ser")
	public String ser()
	{
		return "search.jsp";
	}
	
	@RequestMapping(value="/search")
	public ModelAndView search(@RequestParam Long e_id) {
		ModelAndView mv = new ModelAndView("getemp.jsp");
		Optional<Registration> r1=regis.findById(e_id);
		if (r1.isPresent()) {
		Registration r3 = r1.get();
		mv.addObject("eid",r3.getE_id());
		mv.addObject("fn",r3.getFirst_name());
		mv.addObject("ln",r3.getLast_name());
		mv.addObject("quali",r3.getQualification());
		mv.addObject("desig",r3.getDesignation());
		mv.addObject("sal",r3.getSalary());
		mv.addObject("bg",r3.getBlood_group());
		mv.addObject("dob",r3.getDob());
		mv.addObject("age",r3.getAge());
		mv.addObject("gen",r3.getGender());
		mv.addObject("mn",r3.getPhone_number());
		mv.addObject("em",r3.getEmail());
		mv.addObject("add",r3.getAddress());
		return mv;
		}
		return mv;
	}	

	
	
	@RequestMapping(value="/upd")
	public String upd()
	{
		return "update.jsp";
	}
	
	@RequestMapping(value="/update")
	public String update(@RequestParam Long e_id,
			@RequestParam String first_name,
			@RequestParam String last_name,
			@RequestParam String designation,
			@RequestParam String qualification,
			@RequestParam int salary,
			@RequestParam String dob,
			@RequestParam String blood_group,
			@RequestParam String age,
			@RequestParam String gender,
			@RequestParam String address,
			@RequestParam String phone_number,
			@RequestParam String email) {
		Optional<Registration> r5=regis.findById(e_id);
		if (r5.isPresent()) {
		Registration  r1 = new Registration(e_id,first_name,last_name,designation,qualification,salary,dob,blood_group,age,gender,address,phone_number,email);
		regis.save(r1);
		return "updated.jsp";
		}
		else
		{
			return "notupdated.jsp";
		}
		
				
	}
	
	
	@RequestMapping(value="/del")
	public String del()
	{
		return "delete.jsp";
	}
	
	@RequestMapping("/delete")  
	private String deleteBook(@RequestParam Long e_id)   
	{ 
		Optional<Registration> r4=regis.findById(e_id);
		if (r4.isPresent()) {
			regis.deleteById(e_id);  
			return "deleted.jsp";
		}
		return "emp_not_present.jsp";
	}  

	
	
	
}






