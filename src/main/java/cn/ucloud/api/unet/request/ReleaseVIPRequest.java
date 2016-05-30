package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.response.ReleaseVIPResponse;

/**
 * 释放VIP资源
 * 
 * @author pingqc
 */
public class ReleaseVIPRequest implements UCloudRequest<ReleaseVIPResponse> {

	private static final String ACTION = "ReleaseVIP";

	@NotNull
	private String region;
	@NotNull
	private String vip;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
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
		map.put("VIP", vip);
		return map;
	}

	@Override
	public Class<ReleaseVIPResponse> getResponseClass() {
		return ReleaseVIPResponse.class;
	}

}
