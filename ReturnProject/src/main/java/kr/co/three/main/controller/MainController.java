package kr.co.three.main.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.three.main.dto.MainDTO;
import kr.co.three.main.service.MainServiceImpl;
import kr.co.three.sales.dto.SalesDTO;

@Controller
public class MainController {

	@Autowired
	private MainServiceImpl mainService;

//	메인 페이지로 이동
	@RequestMapping("/")
	public String mainPage(SalesDTO sales, Model model) {

		// 상품 리스트
		List<SalesDTO> list = mainService.mainSalesList(sales);

		model.addAttribute("sales", list);

		return "main/mainPage";
	}

//	검색 페이지로 이동
	@PostMapping("/main/search.do")
	public String search(SalesDTO sales, MainDTO main, Model model, HttpSession session) {

		try {
			int memberNo = (int) session.getAttribute("memberNo");
			main.setMemberNo(memberNo);

			// 검색 페이지 검색 데이터 등록
			int result = mainService.insertSearch(main);

			// 검색 데이터 리스트
			List<MainDTO> searchList = mainService.searchList(main);

			// 상품 리스트
			List<SalesDTO> salesList = mainService.mainSalesList(sales);
			
			model.addAttribute("sales", salesList);

			model.addAttribute("search", searchList);

			return "main/searchPage";

		} catch (NullPointerException e) {

			// 검색 데이터 리스트
			List<MainDTO> searchList = mainService.searchList(main);

			// 상품 리스트
			List<SalesDTO> salesList = mainService.mainSalesList(sales);
			model.addAttribute("sales", salesList);

			model.addAttribute("search", searchList);

			return "main/searchPage";
		}
	}

}