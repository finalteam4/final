package com.khit.planb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
// 로그인, 회원가입, 마이페이지 불러오기	
	@GetMapping("/member/login")
	public String loginForm() {
		return "/member/login";
	}
	@GetMapping("/member/join")
	public String joinForm() {
		return "/member/join";
	}
	@GetMapping("/member/account")
	public String accountForm() {
		return "/member/account";
	}
	
//	메뉴 불러오기
	@GetMapping("/board/preparation")
	public String preparationPage() {
		return "/board/preparation";
	}
	@GetMapping("/board/condition")
	public String conditionPage() {
		return "/board/condition";
	}
	@GetMapping("/board/community")
	public String communityPage() {
		return "/board/community";
	}
	
	
}
