package id.co.me.jwpmvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
	@GetMapping("/dashboard")
	public String index() {
		return "dashboard";
	}
}
