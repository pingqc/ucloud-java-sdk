package cn.ucloud.api.uhost.response;

import java.util.List;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.uhost.domain.PriceInfo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 根据UHost实例配置，获取UHost实例的价格。
 * 
 * @author pingqc
 *
 */
public class GetUHostInstancePriceResponse extends UCloudResponse {

	@JSONField(name = "PriceSet")
	private List<PriceInfo> priceSet;

	public List<PriceInfo> getPriceSet() {
		return priceSet;
	}

	public void setPriceSet(List<PriceInfo> priceSet) {
		this.priceSet = priceSet;
	}

}
