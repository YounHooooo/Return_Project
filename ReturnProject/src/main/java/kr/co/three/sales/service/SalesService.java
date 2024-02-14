package kr.co.three.sales.service;

import java.util.List;

import kr.co.three.common.PageInfo;
import kr.co.three.main.dto.MainDTO;
import kr.co.three.sales.dto.SalesDTO;

public interface SalesService {

//	상품관리 전체 리스트 수
	int salesSelectListCount(SalesDTO sales);

//	상품관리 목록 불러오기
	List<SalesDTO> salesSelectListAll(PageInfo pi, SalesDTO sales);

//	상품 수정 폼 이동
	SalesDTO updateSalesForm(int salesNo);

//	상품 수정
	int updateSales(SalesDTO sales);

//	상품 삭제
	int deleteSales(int salesNo);

//	상품 상세
	SalesDTO detailSales(int salesNo);

//	최근 본 상품
	int recentSales(SalesDTO sales);

//	판매 등록
	int enrollSales(SalesDTO sales);

//	판매등록 작성자 조회
	int selectSalesMember(int salesNo);

//	기존 파일이름 조회
	String selectFileName(int salesNo);

//	상품 수정(upload가 비어있을 때)
	int updateSalesEmptyUpload(SalesDTO sales);

//	찜 목록 추가
	int likeBtn(SalesDTO sales);

//	판매 상태 : 판매 중
	int salesStatus(int salesNo);

//	결제 정보 체크
	SalesDTO payCheck(int salesNo);

//	판매 번호 조회
	int selectSalesNo(int memberNo);

//	판매상품 회원번호 조회
	int selectMemberNo(int salesNo);

//	찜 카운트 증가
	int updateLikesCount(SalesDTO sales);

//	판매 수량 업데이트
	int updateCount(SalesDTO sales);

//	상품 판매 수 업데이트
	int updateCompleteCount(SalesDTO sales);

//	상품 상태 업데이트
	int salesStatusUpdate(SalesDTO sales);

}
