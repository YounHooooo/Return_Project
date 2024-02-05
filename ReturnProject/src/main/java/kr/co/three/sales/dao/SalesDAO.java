package kr.co.three.sales.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.three.common.PageInfo;
import kr.co.three.main.dto.MainDTO;
import kr.co.three.sales.dto.SalesDTO;

@Repository
public class SalesDAO {

//	상품관리 전체 리스트 수
	public int salesSelectListCount(SalesDTO sales, SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("salesMapper.salesSelectListCount", sales);
	}

//	상품관리 목록 불러오기
	public List<SalesDTO> salesSelectListAll(PageInfo pi, SalesDTO sales, SqlSessionTemplate sqlSession) {
		// 현재 페이지의 게시글을 불러오기 위한 변수
		int offset = (pi.getCpage() - 1) * pi.getBoardLimit();

		// 작은 규모일 경우에만 사용하는것을 권장
		RowBounds rb = new RowBounds(offset, pi.getBoardLimit());

		return sqlSession.selectList("salesMapper.salesSelectListAll", sales, rb);
	}

//	상품 수정 폼 이동
	public SalesDTO updateSalesForm(int salesNo, SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("salesMapper.updateSalesForm", salesNo);
	}

//	상품 수정
	public int updateSales(SalesDTO sales, SqlSessionTemplate sqlSession) {
		return sqlSession.update("salesMapper.updateSales", sales);
	}

//	상품 삭제
	public int deleteSales(int salesNo, SqlSessionTemplate sqlSession) {
		return sqlSession.delete("salesMapper.deleteSales", salesNo);
	}

//	상품 상세
	public SalesDTO detailSales(int salesNo, SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("salesMapper.detailSales", salesNo);
	}

//	최근 본 상품
	public int recentSales(SalesDTO sales, SqlSessionTemplate sqlSession) {
		return sqlSession.insert("salesMapper.recentSales", sales);
	}

//	판매 등록
	public int enrollSales(SalesDTO sales, SqlSessionTemplate sqlSession) {
		return sqlSession.insert("salesMapper.enrollSales", sales);
	}

//	판매등록 작성자 조회
	public int selectSalesMember(int salesNo, SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("salesMapper.selectSalesMember", salesNo);
	}

//	기존 파일이름 조회
	public String selectFileName(int salesNo, SqlSessionTemplate sqlSession) {
		return sqlSession.selectOne("salesMapper.selectFileName", salesNo);
	}

//	상품 수정(upload가 비어있을 때)
	public int updateSalesEmptyUpload(SalesDTO sales, SqlSessionTemplate sqlSession) {
		return sqlSession.update("salesMapper.updateSalesEmptyUpload", sales);
	}

//	찜 목록 추가
	public int likeBtn(SalesDTO sales, SqlSessionTemplate sqlSession) {
		return sqlSession.insert("salesMapper.likeBtn", sales);
	}

}
