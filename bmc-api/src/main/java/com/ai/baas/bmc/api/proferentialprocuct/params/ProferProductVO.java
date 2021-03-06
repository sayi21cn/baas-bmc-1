package com.ai.baas.bmc.api.proferentialprocuct.params;

import java.sql.Timestamp;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.ai.baas.bmc.api.proferentialprocuct.interfaces.IProferProductManageSV;
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
	@NotNull(message="消息流水号不能为空",groups={IProferProductManageSV.AddProferProduct.class,IProferProductManageSV.AddDiscontProduct.class})
	private String tradeSeq;
	
	/**
	 * 产品Id
	 */
	@NotNull(message="产品Id不能为空",groups={IProferProductManageSV.UpdateProferProduct.class,IProferProductManageSV.AddDiscontProduct.class})
	private String productId;
	
	/**
	 * 优惠产品类型，必填
	 */
	@NotNull(message="优惠产品类型不能为空",groups={IProferProductManageSV.AddProferProduct.class,IProferProductManageSV.AddDiscontProduct.class})
	private String productType;
	
	
	/**
	 * 优惠活动名称
	 */
	@NotNull(message="优惠活动名称不能为空",groups={IProferProductManageSV.AddProferProduct.class,IProferProductManageSV.AddDiscontProduct.class})
	private String programName;
	
	/**
	 * 规则金额
	 */
	@NotNull(message="优惠规则不能为空",groups={IProferProductManageSV.AddProferProduct.class,IProferProductManageSV.AddDiscontProduct.class})
	private double ruleAmount;
	/**
	 * 规则单位
	 */
	@NotNull(message="优惠单位不能为空",groups={IProferProductManageSV.AddProferProduct.class,IProferProductManageSV.AddDiscontProduct.class})
	private String ruleUnit;
	/**
	 * 满减金额
	 */
	@NotNull(message="满减金额不能为空",groups={IProferProductManageSV.AddDiscontProduct.class})
	private double reduceAmount;
	
	/**
	 * 生效日期，必填
	 */
	@NotNull(message="生效日期不能为空",groups={IProferProductManageSV.AddProferProduct.class,IProferProductManageSV.AddDiscontProduct.class})
	private Timestamp activeDate;
	
	/**
	 * 失效时间，必填
	 */
	@NotNull(message=" 失效时间不能为空",groups={IProferProductManageSV.AddProferProduct.class,IProferProductManageSV.AddDiscontProduct.class})
	private Timestamp invalidDate;
	/**
	 * 备注
	 */
	private String comments;
	/**
	 * 已选择的产品列表,必填
	 */
	private List<Integer> productList;
	/**
	 * 赠品类型
	 */
	private List<String> giftType;
	/**
	 * 赠品数量
	 */
	private double gitfAmount;
	
	/**
	 * 赠品生效日期
	 */
	private Timestamp giftActiveDate;
	/**
	 * 赠品失效日期
	 */
	private Timestamp giftInvalidDate;
	/**
	 *参与赠品产品列表
	 */
	private List<Integer> giftProList;
	/**
	 * 操作员Id
	 */
	private String operatorId;
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
	
	public double getRuleAmount() {
		return ruleAmount;
	}
	public void setRuleAmount(double ruleAmount) {
		this.ruleAmount = ruleAmount;
	}
	public String getRuleUnit() {
		return ruleUnit;
	}
	public void setRuleUnit(String ruleUnit) {
		this.ruleUnit = ruleUnit;
	}
	public double getReduceAmount() {
		return reduceAmount;
	}
	public void setReduceAmount(double reduceAmount) {
		this.reduceAmount = reduceAmount;
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
	
	public String getTradeSeq() {
		return tradeSeq;
	}
	public void setTradeSeq(String tradeSeq) {
		this.tradeSeq = tradeSeq;
	}
	public List<Integer> getProductList() {
		return productList;
	}
	public void setProductList(List<Integer> productList) {
		this.productList = productList;
	}
	
	
	public List<String> getGiftType() {
		return giftType;
	}
	public void setGiftType(List<String> giftType) {
		this.giftType = giftType;
	}
	public double getGitfAmount() {
		return gitfAmount;
	}
	public void setGitfAmount(double gitfAmount) {
		this.gitfAmount = gitfAmount;
	}
	public Timestamp getGiftActiveDate() {
		return giftActiveDate;
	}
	public void setGiftActiveDate(Timestamp giftActiveDate) {
		this.giftActiveDate = giftActiveDate;
	}
	public Timestamp getGiftInvalidDate() {
		return giftInvalidDate;
	}
	public void setGiftInvalidDate(Timestamp giftInvalidDate) {
		this.giftInvalidDate = giftInvalidDate;
	}
	public List<Integer> getGiftProList() {
		return giftProList;
	}
	public void setGiftProList(List<Integer> giftProList) {
		this.giftProList = giftProList;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	
	
}
