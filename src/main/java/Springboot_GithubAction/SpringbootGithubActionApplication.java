package Springboot_GithubAction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGithubActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGithubActionApplication.class, args);
	}

	@RequestMapping("/test")
	public String test()
	{
		return "Github action test";
	}
}
