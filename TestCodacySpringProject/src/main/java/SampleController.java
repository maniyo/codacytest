import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("/sample")
	public String Test(Map<String, Object> model) {
		return "Hello World";
	}

	
}
