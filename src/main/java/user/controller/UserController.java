package user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import user.service.UserService;
import user.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	Logger logger;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public void userList(Model model) throws Exception {
		
		logger.info("직원 목록 조회 >>> ");
		
		List<UserVO> list = userService.getUserList();
		System.out.println(list);
	}
	
	@GetMapping("/list2")
	public String list2() {
		logger.info("테스트 문구 >>> ");
		return "테스트 문구";
	}
}
