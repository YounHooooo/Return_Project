package kr.co.three.sales.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SalesDTO {
	private int salesNo;
	private String salesName;
	private String salesCategory;
	private String salesAddress;
	private String salesCondition;
	private int salesPrice;
	private int salesDelivery;
	private String salesComment;
	private int salesCount;
	private String salesImageName;
	private String salesImagePath;
	private String salesOriginImageName;
	private Date salesDate;
	private Date salesUpdateDate;
	private Date salesDeleteDate;
	private int salesComplete;
	private int memberNo;
	private String salesChatLink;
	private int salesLikesCount;

	private String searchText = "";
	private String searchWord = "";

}
