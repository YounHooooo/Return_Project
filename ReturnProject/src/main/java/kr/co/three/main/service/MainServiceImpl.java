package kr.co.three.main.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.three.main.dao.MainDAO;
import kr.co.three.main.dto.MainDTO;
import kr.co.three.sales.dto.SalesDTO;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	private MainDAO mainDAO;

	@Autowired
	private SqlSessionTemplate sqlSession;

//	검색 페이지 검색 데이터 등록
	@Override
	public int insertSearch(MainDTO main) {
		return mainDAO.insertSearch(main, sqlSession);
	}

//	검색 데이터 리스트
	@Override
	public List<MainDTO> searchList(MainDTO main) {
		return mainDAO.searchList(main, sqlSession);
	}

//	상품 리스트
	@Override
	public List<SalesDTO> mainSalesList(SalesDTO sales) {
		return mainDAO.mainSalesList(sales, sqlSession);
	}

//	카테고리 페이지

//	가전 카테고리
	@Override
	public List<SalesDTO> homeAppliances() {
		return mainDAO.homeAppliances(sqlSession);
	}

//	의류 카테고리
	@Override
	public List<SalesDTO> clothes() {
		return mainDAO.clothes(sqlSession);
	}

//	향수 카테고리
	@Override
	public List<SalesDTO> perfume() {
		return mainDAO.perfume(sqlSession);
	}

//	푸드 카테고리
	@Override
	public List<SalesDTO> food() {
		return mainDAO.food(sqlSession);
	}

//	주얼리 카테고리
	@Override
	public List<SalesDTO> jewelry() {
		return mainDAO.jewelry(sqlSession);
	}

}
