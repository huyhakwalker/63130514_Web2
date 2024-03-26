package thiGK.ntu63130514.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home_63130514Controller {
	@GetMapping("/index")
	public String Home(ModelMap mm) {
	    return "index";
	}
}
