package go.dummy.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/go")
public class MyController {

	@GetMapping
	public String message() {
		return "failed";
	}
}
