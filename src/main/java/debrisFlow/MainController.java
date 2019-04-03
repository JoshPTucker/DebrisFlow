package debrisFlow;


import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	@RequestMapping("/index")
	public String index(){

		return "index";
		
	}
}
