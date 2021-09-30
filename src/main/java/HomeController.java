import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	Logger logger;
	
	public String home() {
		
		logger.info("홈페이지 입장 >>> ");
		return "/index.html";
	}
}
