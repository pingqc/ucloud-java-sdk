package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.umon.domain.ResourceType;
import cn.ucloud.api.unet.response.DeleteSecurityGroupResponse;

/**
 * 删除防火墙
 * 
 * @author pingqc
 */
public class DeleteSecurityGroupRequest implements
		UCloudRequest<DeleteSecurityGroupResponse> {

	private static final String ACTION = "DeleteSecurityGroup";

	@NotNull
	private String region;
	@NotNull
	private String groupId;

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
		return map;
	}

	@Override
	public Class<DeleteSecurityGroupResponse> getResponseClass() {
		return DeleteSecurityGroupResponse.class;
	}

}
