package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/default")
public class ViewController {

    @RequestMapping("/index")
    public String indexPage(Model model) {
        model.addAttribute("StudentId", "2021FHCO042");
        model.addAttribute("StudentName", "Aditya");
        model.addAttribute("StudentDepartment", "Computer-Science");
        model.addAttribute("StudentRollNo", "54");
        
        return "index";
    }
    
    @RequestMapping("/home")
    public ModelAndView homePage() {
    	ModelAndView model = new ModelAndView();
    	model.addObject("StudentId","2021FHCO042");
    	model.addObject("StudentName","Aditya");
    	model.addObject("Department","Computer");
    
    	model.setViewName("home");
    	return model;
    	
    }
}