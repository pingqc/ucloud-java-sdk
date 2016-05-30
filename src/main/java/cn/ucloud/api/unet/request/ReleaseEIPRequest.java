package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.response.ReleaseEIPResponse;

/**
 * 修改EIP名字业务组备注等属性字段<br/>
 * 
 * @author pingqc
 */
public class ReleaseEIPRequest implements UCloudRequest<ReleaseEIPResponse> {

	private static final String ACTION = "ReleaseEIP";

	@NotNull
	private String region;
	@NotNull
	private String eipId;

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

		return map;
	}

	@Override
	public Class<ReleaseEIPResponse> getResponseClass() {
		return ReleaseEIPResponse.class;
	}

}
