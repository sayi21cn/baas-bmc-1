package com.ai.baas.bmc.api.proferentialprocuct.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.baas.bmc.api.proferentialprocuct.interfaces.IProferProductManageSV;
import com.ai.baas.bmc.api.proferentialprocuct.params.ActiveProductVO;
import com.ai.baas.bmc.api.proferentialprocuct.params.ProductResponse;
import com.ai.baas.bmc.api.proferentialprocuct.params.ProferProductVO;
import com.ai.baas.bmc.api.proferentialprocuct.params.productDelVO;
import com.ai.baas.bmc.business.interfaces.ICpFullPresentBusi;
import com.ai.baas.bmc.business.interfaces.ICpPriceDetailBusi;
import com.ai.baas.bmc.business.interfaces.ICpPriceInfoBusi;
import com.ai.baas.bmc.constants.ExceptCodeConstant;
import com.ai.baas.bmc.dao.mapper.bo.CpFullPresent;
import com.ai.baas.bmc.dao.mapper.bo.CpPriceDetail;
import com.ai.baas.bmc.dao.mapper.bo.CpPriceInfo;
import com.ai.baas.bmc.util.BmcSeqUtil;
import com.ai.opt.base.exception.BusinessException;
import com.ai.opt.base.exception.SystemException;
import com.ai.opt.base.vo.ResponseHeader;
import com.ai.opt.sdk.util.DateUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;

@Service(validation = "true")
@Component
public class ProferProductManageSV implements IProferProductManageSV {

	@Autowired
	private ICpPriceInfoBusi cpPriceInfoBusi;
	@Autowired
	private ICpPriceDetailBusi cpPriceDetailBusi;
	@Autowired
	private ICpFullPresentBusi cpFullPresentBusi;

	/**
	 * 满赠添加
	 */
	@Override
	public ProductResponse addProferProduct(ProferProductVO vo) throws BusinessException, SystemException {
		/**
		 * 插入资费信息表 cp_price_info
		 */
		String priceCode = BmcSeqUtil.getPriceCode();
		CpPriceInfo cpPriceInfo = new CpPriceInfo();
		cpPriceInfo.setPriceInfoId(BmcSeqUtil.getPriceInfoId());
		cpPriceInfo.setPriceCode(priceCode);
		cpPriceInfo.setCreateTime(DateUtil.getSysDate());
		cpPriceInfo.setActiveTime(vo.getActiveDate());
		cpPriceInfo.setComments(vo.getComments());
		cpPriceInfo.setOperatorId(vo.getOperatorId());
		cpPriceInfo.setInactiveTime(vo.getInvalidDate());
		cpPriceInfo.setPriceName(vo.getProgramName());
		cpPriceInfo.setProductType(vo.getProductType());
		cpPriceInfo.setTenantId(vo.getTenantId());
		// TODO 有返回值，后期注意处理
		cpPriceInfoBusi.addCpPriceInfo(cpPriceInfo);

		/**
		 * 插入资费计划明细表 cp_price_detail
		 */
		CpPriceDetail detail = new CpPriceDetail();
		detail.setPriceCode(priceCode);
		// detail.setActiveTime(vo.getActiveDate());
		String billType = vo.getProductType();
		detail.setChargeType(billType);
		detail.setComments(vo.getComments());
		String detailCode = BmcSeqUtil.getDetailCode();
		detail.setDetailCode(detailCode);
		detail.setDetailId(BmcSeqUtil.getDetailId());
		// 冗余字段，暂时不填
		// detail.setDetailName(vo.getProgramName());
		// detail.setInactiveTime(vo.getInvalidDate());
		detail.setPriceCode(priceCode);
		// 冗余字段，暂时不填
		// detail.setServiceType(vo.getProductType());
		cpPriceDetailBusi.addCpPriceDetal(detail);

		/**
		 * 插入满赠的详细表
		 */
		
		
		// TODO 如果有多个赠品则需要添加多个赠品

		
		for(String type:vo.getGiftType()){
			CpFullPresent present = new CpFullPresent();
			if("SERVICETYPE".equals(type)){
				present.setPresentType(type);
				present.setActiveTime(vo.getGiftActiveDate());
				present.setDetailCode(detailCode);
				present.setInactiveTime(vo.getGiftInvalidDate());
				
				String presentCode = BmcSeqUtil.getPresentCode();
				present.setPresentCode(presentCode);
				present.setPresentId(BmcSeqUtil.getPresentId());
				present.setProductGiftIds(JSON.toJSONString(vo.getGiftProList()));
				present.setProductIds(JSON.toJSONString(vo.getProductList()));
			}else if("CASH".equals(type)){
				present.setPresentType(type);
				present.setPresentAmount(vo.getGitfAmount());
				present.setActiveTime(vo.getGiftActiveDate());
				present.setDetailCode(detailCode);
				present.setInactiveTime(vo.getGiftInvalidDate());
				
				String presentCode = BmcSeqUtil.getPresentCode();
				present.setPresentCode(presentCode);
				present.setPresentId(BmcSeqUtil.getPresentId());
				present.setProductIds(JSON.toJSONString(vo.getProductList()));
			}else if("VIRTURECOIN".equals(type)){
				present.setPresentType(type);
				present.setPresentAmount(vo.getGitfAmount());
				present.setActiveTime(vo.getGiftActiveDate());
				present.setDetailCode(detailCode);
				present.setInactiveTime(vo.getGiftInvalidDate());
				
				String presentCode = BmcSeqUtil.getPresentCode();
				present.setPresentCode(presentCode);
				present.setPresentId(BmcSeqUtil.getPresentId());
				present.setProductIds(JSON.toJSONString(vo.getProductList()));
			}
			cpFullPresentBusi.addFullPresent(present);
		}
		
		
		
		ProductResponse response = new ProductResponse();
		ResponseHeader responseHeader = new ResponseHeader(true, ExceptCodeConstant.SUCCESS, "成功");
		response.setResponseHeader(responseHeader);

		return response;
	}

	@Override
	public ProductResponse addDiscontProduct(ProferProductVO vo) throws BusinessException, SystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProferProductStatus(ActiveProductVO vo) throws BusinessException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delProferProduct(productDelVO vo) throws BusinessException, SystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProferProduct(ProferProductVO vo) throws BusinessException, SystemException {
		// TODO Auto-generated method stub

	}

}
