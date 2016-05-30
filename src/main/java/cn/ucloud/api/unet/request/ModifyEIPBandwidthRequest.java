package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.response.ModifyEIPBandwidthResponse;

/**
 * 修改弹性IP的外网带宽
 * 
 * @author pingqc
 */
public class ModifyEIPBandwidthRequest implements
		UCloudRequest<ModifyEIPBandwidthResponse> {

	private static final String ACTION = "ModifyEIPBandwidth";

	@NotNull
	private String region;
	@NotNull
	private String eipId;
	@NotNull
	private Integer bandwidth;

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

	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
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
		map.put("Bandwidth", bandwidth);

		return map;
	}

	@Override
	public Class<ModifyEIPBandwidthResponse> getResponseClass() {
		return ModifyEIPBandwidthResponse.class;
	}

}
