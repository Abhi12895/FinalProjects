 
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/client")
public class HelloResource {
	@Autowired
	RestTemplate template;
	public static String CLIENT_SERVICE="clientService";

	@GetMapping
	@CircuitBreaker(name="CLIENT_SERVICE",fallbackMethod="callOnFail")
	public String callServer() {
		//String url="http://localhost:8093/rest/service/status";
		String url="http://localhost:8093/rest/service";
		String output=template.getForObject(url, String.class);
		return output;
	}
	public String callOnFail(Exception e) {
		return "message from CallOnFail().....";
	}
}
 


//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//
//@RestController
//@RequestMapping("/api/client")
//public class HelloClientResource {
//	@Autowired
//	RestTemplate template;
//	
//	@HystrixCommand(fallbackMethod="fallback",
//			groupKey="Hello",
//			commandKey="hello",
//			threadPoolKey="helloThread")
//	@GetMapping
//	public String hello() {
//		String url="http://hello-server/rest/hello/server";
//		return template.getForObject(url,String.class);
//	}
//	
//	public String fallback(Throwable hystrixCommand) {
//		return "Fall Back HelloWorld";
//	}
//	@GetMapping
//	public String callServer() {
//		
//		String url="http://localhost:8093/rest/service/status";
//		String output=template.getForObject(url, String.class);
//		return output;
//	}
//
//}