package cn.ucloud.api.uhost.domain;

import com.alibaba.fastjson.annotation.JSONField;

import cn.ucloud.api.unet.domain.ChargeType;

/**
 * 价格信息
 * 
 * @author pingqc
 *
 */
public class PriceInfo {

	@JSONField(name = "ChargeType")
	private ChargeType chargeType;
	@JSONField(name = "Price")
	private Float price;

	public ChargeType getChargeType() {
		return chargeType;
	}

	public void setChargeType(ChargeType chargeType) {
		this.chargeType = chargeType;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
