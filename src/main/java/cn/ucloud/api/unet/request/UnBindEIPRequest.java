package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.umon.domain.ResourceType;
import cn.ucloud.api.unet.response.UnBindEIPResponse;

/**
 * 将弹性IP从资源上解绑
 * 
 * @author pingqc
 */
public class UnBindEIPRequest implements UCloudRequest<UnBindEIPResponse> {

	private static final String ACTION = "UnBindEIP";

	@NotNull
	private String region;
	@NotNull
	private String eipId;
	@NotNull
	private ResourceType resourceType;
	@NotNull
	private String resourceId;

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

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
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
		map.put("ResourceType", resourceType);
		map.put("ResourceId", resourceId);

		return map;
	}

	@Override
	public Class<UnBindEIPResponse> getResponseClass() {
		return UnBindEIPResponse.class;
	}

}
