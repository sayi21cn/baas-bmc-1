package com.ai.baas.bmc.api.proferentialprocuct.params;

import java.sql.Timestamp;

import com.ai.opt.base.vo.BaseResponse;
/**
 * 优惠产品查询返回参数
 *
 * Date: 2016年3月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author gaogang
 */
public class ProferProductInfo extends BaseResponse {

	
	private static final long serialVersionUID = 1L;
	/**
	 * 优惠产品Id
	 */
	private String productId;
	/**
	 * 优惠类型
	 */
	private String ProferType;
	/**
	 * 优惠产品（包）名称
	 */
	private String productName;
	/**
	 * 优惠规则
	 */
	private String rule;
	/**
	 * 产品生效日期
	 */
	private Timestamp activeDate;
	/**
	 * 产品失效日期
	 */
	private Timestamp invalidDate;
	/**
	 * 状态
	 */
	private String status;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProferType() {
		return ProferType;
	}
	public void setProferType(String proferType) {
		ProferType = proferType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public Timestamp getActiveDate() {
		return activeDate;
	}
	public void setActiveDate(Timestamp activeDate) {
		this.activeDate = activeDate;
	}
	public Timestamp getInvalidDate() {
		return invalidDate;
	}
	public void setInvalidDate(Timestamp invalidDate) {
		this.invalidDate = invalidDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
