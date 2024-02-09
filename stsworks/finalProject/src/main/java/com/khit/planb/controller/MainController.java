package com.khit.planb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
// header - 로그인, 회원가입, 마이페이지 불러오기	
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
	// footer - ADMIN : 관리자 전용 페이지(회원목록)
	@GetMapping("/member/admin")
	public String managementPage() {
		return "/member/admin";
	}
	
//	header 메뉴 불러오기 - 재난예방대비, 재난 현황, 참여와 신고
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
	// chatbot서비스 
	@GetMapping("/chatbot")
	public String chatService() {
		return "/chatbot";
	}

// footer 메뉴 (공지사항, FAQ, 개인정보처리방침)
	@GetMapping("/board/notice")
	public String noticePage() {
		return "/board/notice";
	}
	@GetMapping("/pages/faq")
	public String faqPage() {
		return "/pages/faq";
	}
	@GetMapping("/pages/privacyPolicy")
	public String ppPage() {
		return "/pages/privacyPolicy";
	}
// others폴더의 html 불러오기
	@GetMapping("/others/emergency-contacts")
	public String emergencyPage() {
		return "/others/emergency-contacts";
	}
// pages폴더의 html불러오기
	
	@GetMapping("/pages/public-institution")
	public String publicPages() {
		return "/pages/public-institution";
	}
	
}
