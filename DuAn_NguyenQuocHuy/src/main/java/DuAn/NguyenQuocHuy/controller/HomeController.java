package DuAn.NguyenQuocHuy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/dish_register")
	public String dishRegister() {
		return "dishRegister";
	}
	
	@GetMapping("/available_dish")
	public String getAllDish() {
		return "dishList";
	}
}
