package cn.ucloud.api.unet.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 弹性IP价格详情
 * 
 * @author pingqc
 *
 */
public class EIPPrice {

	@JSONField(name = "ChargeType")
	private ChargeType chargeType;
	@JSONField(name = "Price")
	private Float price;
	@JSONField(name = "PurchaseValue")
	private Integer purchaseValue;

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

	public Integer getPurchaseValue() {
		return purchaseValue;
	}

	public void setPurchaseValue(Integer purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

}
