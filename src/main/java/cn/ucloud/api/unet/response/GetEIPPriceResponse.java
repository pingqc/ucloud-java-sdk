package cn.ucloud.api.unet.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.unet.domain.EIPPrice;

/**
 * 获取弹性IP价格
 * 
 * @author pingqc
 *
 */
public class GetEIPPriceResponse extends UCloudResponse {

	@JSONField(name = "PriceSet")
	private List<EIPPrice> priceSet;

	public List<EIPPrice> getPriceSet() {
		return priceSet;
	}

	public void setPriceSet(List<EIPPrice> priceSet) {
		this.priceSet = priceSet;
	}

}
