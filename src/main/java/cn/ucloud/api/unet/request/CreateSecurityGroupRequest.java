package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.domain.SecurityRule;
import cn.ucloud.api.unet.response.CreateSecurityGroupResponse;

/**
 * 创建防火墙组
 * 
 * @author pingqc
 */
public class CreateSecurityGroupRequest implements
		UCloudRequest<CreateSecurityGroupResponse> {

	private static final String ACTION = "CreateSecurityGroup";

	@NotNull
	private String region;
	@NotNull
	private String groupName;
	@NotNull
	private String description;
	@NotNull
	private List<SecurityRule> rules;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SecurityRule> getRules() {
		return rules;
	}

	public void setRules(List<SecurityRule> rules) {
		this.rules = rules;
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
		map.put("GroupName", groupName);
		map.put("Description", description);
		if(rules != null) {
			for(int i = 0, size = rules.size(); i < size; i++) {
				SecurityRule rule = rules.get(i);
				StringBuilder value = new StringBuilder();
				value.append(rule.getProto())
					 .append("|")
					 .append(rule.getDstPort())
					 .append("|")
					 .append(rule.getSrcIp())
					 .append("|")
					 .append(rule.getAction())
					 .append("|")
					 .append(rule.getPriority());
				map.put("Rule." + i, value);
			}
		}
		map.put("GroupName", groupName);
		return map;
	}

	@Override
	public Class<CreateSecurityGroupResponse> getResponseClass() {
		return CreateSecurityGroupResponse.class;
	}

}
