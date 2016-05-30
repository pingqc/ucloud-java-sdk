package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.domain.SecurityRule;
import cn.ucloud.api.unet.response.UpdateSecurityGroupResponse;

/**
 * 更新防火墙规则
 * 
 * 在更新防火墙规则时，新的规则会覆盖掉原有规则。所以若需要更改或加入新的规则，需要将原所有规则与新规则一起提交。
 * 
 * @author pingqc
 */
public class UpdateSecurityGroupRequest implements
		UCloudRequest<UpdateSecurityGroupResponse> {

	private static final String ACTION = "UpdateSecurityGroup";

	@NotNull
	private String region;
	@NotNull
	private String groupId;
	@NotNull
	private List<SecurityRule> rules;

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
		map.put("GroupId", groupId);
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
		return map;
	}

	@Override
	public Class<UpdateSecurityGroupResponse> getResponseClass() {
		return UpdateSecurityGroupResponse.class;
	}

}
