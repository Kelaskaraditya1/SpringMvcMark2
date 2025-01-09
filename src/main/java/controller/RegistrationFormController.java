package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import model.User;

@Controller
public class RegistrationFormController {
	
	@RequestMapping("/registration")
	public String registrationForm() {
		
		return "registration_form";
	}
	
	@RequestMapping(path="/process",method=RequestMethod.POST)
	public String processForm(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("username") String username,
			@RequestParam("phoneNo") String phoneNo,
			@RequestParam("password") String password,
			Model model) {
		
		
		System.out.println("Name:"+name);
		System.out.println("Username:"+username);
		System.out.println("Email:"+email);
		System.out.println("PhoneNo:"+phoneNo);
		System.out.println("Password:"+password);
		
		if(email.isEmpty()||password.isEmpty()) {
			return "redirect:/registration";
		}
		else if(password.length()<8)
			return "redirect:/registration";
		
		model.addAttribute("name",name);
		model.addAttribute("userName",username);
		model.addAttribute("email",email);
		model.addAttribute("phoneNo",phoneNo);	
		model.addAttribute("password",password);
		
//		User user = new User();
//		user.setName(name);
//		user.setEmail(email);
//		user.setUsername(username);
//		user.setPassword(password);
//		user.setPhoneNo(phoneNo);
//		
//		model.addAttribute("user",user);
		
		return "information";

	}
	
	
//	@RequestMapping(path="/process",method=RequestMethod.POST)
//	public String processForm(
//			@ModelAttribute User user
//			,Model model
//			) {
//		
//		return "information";
//	}
	

}
