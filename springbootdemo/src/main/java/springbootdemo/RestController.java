package springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	    @RequestMapping("/welcome")
		public String welcome() {
			return "Welcome to Spring Boot !!!!!";
			
		}

}
