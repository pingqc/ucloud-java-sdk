package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.umon.domain.ResourceType;
import cn.ucloud.api.unet.response.GrantSecurityGroupResponse;

/**
 * 将防火墙应用到资源上
 * 
 * @author pingqc
 */
public class GrantSecurityGroupRequest implements
		UCloudRequest<GrantSecurityGroupResponse> {

	private static final String ACTION = "GrantSecurityGroup";

	@NotNull
	private String region;
	@NotNull
	private String groupId;
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

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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
		map.put("GroupId", groupId);
		map.put("ResourceType", resourceType);
		map.put("ResourceId", resourceId);
		return map;
	}

	@Override
	public Class<GrantSecurityGroupResponse> getResponseClass() {
		return GrantSecurityGroupResponse.class;
	}

}
