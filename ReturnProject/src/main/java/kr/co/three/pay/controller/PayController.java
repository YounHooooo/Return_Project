package kr.co.three.pay.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.three.pay.dto.PayDTO;

@Controller
@RequestMapping("/pay")
public class PayController {

//	결제 페이지로 이동
	@GetMapping("/payPage.do")
	public String payPage(@RequestParam("salesNo") int salesNo, PayDTO pay) {

		pay.setSalesNo(salesNo);

		return "pay/payPage";
	}

//	결제 완료 페이지로 이동
	@PostMapping("/paying.do")
	public String paying(PayDTO pay, HttpSession session) {

		int memberNo = (int) session.getAttribute("memberNo");
		pay.setMemberNo(memberNo);

		return "pay/payComplete";

	}
}