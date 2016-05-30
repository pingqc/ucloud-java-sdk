package cn.ucloud.api.unet.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 防火墙组详细信息
 * <table class="docutils" border="1">
 * <colgroup> <col width="25%"> <col width="13%"> <col width="63%"> </colgroup>
 * <thead valign="bottom">
 * <tr class="row-odd">
 * <th class="head">Parameter Name</th>
 * <th class="head">Type</th>
 * <th class="head">Description</th>
 * </tr>
 * </thead> <tbody valign="top">
 * <tr class="row-even">
 * <td>GroupId</td>
 * <td>String</td>
 * <td>防火墙ID</td>
 * </tr>
 * <tr class="row-odd">
 * <td>GroupName</td>
 * <td>String</td>
 * <td>防火墙组的名称</td>
 * </tr>
 * <tr class="row-even">
 * <td>CreateTime</td>
 * <td>String</td>
 * <td>防火墙组创建时间，格式为Unix Timestamp</td>
 * </tr>
 * <tr class="row-odd">
 * <td>Type</td>
 * <td>String</td>
 * <td>防火墙组类型，枚举值为： 0：用户自定义防火墙； 1：默认Web防火墙； 2：默认非Web防火墙</td>
 * </tr>
 * <tr class="row-even">
 * <td>Rule</td>
 * <td>Array</td>
 * <td>防火墙组中的规则列表</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 *
 */
public class FirewallInfo {

	@JSONField(name = "GroupId")
	private String groupId;
	@JSONField(name = "GroupName")
	private String groupName;
	@JSONField(name = "CreateTime")
	private Integer createTime;
	@JSONField(name = "Type")
	private Integer type;
	@JSONField(name = "Description")
	private String description;
	@JSONField(name = "Rule")
	private List<SecurityRule> rules;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<SecurityRule> getRules() {
		return rules;
	}

	public void setRules(List<SecurityRule> rules) {
		this.rules = rules;
	}

}
