package com.ai.baas.bmc.api.proferentialprocuct.params;

import java.sql.Timestamp;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.ai.baas.bmc.api.proferentialprocuct.interfaces.IProferProductManage;
import com.ai.opt.base.vo.BaseInfo;
/**
 * 优惠产品添加入参
 *
 * Date: 2016年3月28日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * @author gaogang
 */
public class ProferProductVO extends BaseInfo {

	
	 
	private static final long serialVersionUID = 1L;

	/**
     * 消息流水<br>
     * 组成：租户ID + YYMMDDHH24MISS + SSS(毫秒) + 9位序列号<br>
     * 必填<br>
     * VARCHAR(32)
     */
	@NotNull(message="消息流水号不能为空",groups={IProferProductManage.AddProferProduct.class})
	private String tradeSeq;
	
	/**
	 * 产品Id
	 */
	private String productId;
	
	/**
	 * 优惠产品类型
	 */
	@NotNull(message="优惠产品类型不能为空",groups={IProferProductManage.AddProferProduct.class})
	private String productType;
	
	
	/**
	 * 优惠活动名称
	 */
	@NotNull(message="优惠活动名称不能为空",groups={IProferProductManage.AddProferProduct.class})
	private String programName;
	/**
	 * 优惠规则
	 */
	@NotNull(message="优惠规则不能为空",groups={IProferProductManage.AddProferProduct.class})
	private String rule;
	/**
	 * 生效日期
	 */
	@NotNull(message="生效日期不能为空",groups={IProferProductManage.AddProferProduct.class})
	private Timestamp activeDate;
	
	/**
	 * 失效时间
	 */
	@NotNull(message=" 失效时间不能为空",groups={IProferProductManage.AddProferProduct.class})
	private Timestamp invalidDate;
	/**
	 * 备注
	 */
	private String comments;
	/**
	 * 已选择的产品列表
	 */
	private List<ProductVO> productList;
	/**
	 * 赠品
	 */
	private String gift;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
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
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public List<ProductVO> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductVO> productList) {
		this.productList = productList;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}
	public String getTradeSeq() {
		return tradeSeq;
	}
	public void setTradeSeq(String tradeSeq) {
		this.tradeSeq = tradeSeq;
	}
	
	
}
