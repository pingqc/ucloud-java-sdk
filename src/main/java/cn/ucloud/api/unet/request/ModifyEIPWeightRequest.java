package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.response.ModifyEIPWeightResponse;

/**
 * 修改弹性IP的外网出口权重
 * 
 * @author pingqc
 */
public class ModifyEIPWeightRequest implements
		UCloudRequest<ModifyEIPWeightResponse> {

	private static final String ACTION = "ModifyEIPWeight";

	@NotNull
	private String region;
	@NotNull
	private String eipId;
	@NotNull
	@Size(min = 0, max = 100)
	private Integer weight;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEipId() {
		return eipId;
	}

	public void setEipId(String eipId) {
		this.eipId = eipId;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String getAction() {
		return ACTION;
	}

	@Override
	public void check() throws InvalidRequestException {
		// TODO check
	}

	@Override
	public Map<String, Object> getTextParams() {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Action", getAction());
		map.put("Region", region);
		map.put("EIPId", eipId);
		map.put("Weight", weight);

		return map;
	}

	@Override
	public Class<ModifyEIPWeightResponse> getResponseClass() {
		return ModifyEIPWeightResponse.class;
	}

}
