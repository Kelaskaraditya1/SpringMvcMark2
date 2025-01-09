package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/first")
	public String firstPage() {
		return "redirect:/second";
	}
	
//	@RequestMapping("/second")
//	public String secondPage() {
//		return "redirect:/registration";
//	}
	
	@RequestMapping("/second")
	public RedirectView secondPage() {
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("registration");
		return redirectView;
		
	}
	
}
