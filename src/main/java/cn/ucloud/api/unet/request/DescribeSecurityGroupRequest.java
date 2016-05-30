package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.umon.domain.ResourceType;
import cn.ucloud.api.unet.response.DescribeSecurityGroupResponse;

/**
 * 获取防火墙组信息<br/>
 * <table class="docutils" border="1">
 * <colgroup> <col width="18%"> <col width="10%"> <col width="61%"> <col
 * width="11%"> </colgroup> <thead valign="bottom">
 * <tr class="row-odd">
 * <th class="head">Parameter name</th>
 * <th class="head">Type</th>
 * <th class="head">Description</th>
 * <th class="head">Required</th>
 * </tr>
 * </thead> <tbody valign="top">
 * <tr class="row-even">
 * <td>Region</td>
 * <td>String</td>
 * <td>数据中心，参见 <a class="reference external"
 * href="../regionlist.html">数据中心列表</a></td>
 * <td>Yes</td>
 * </tr>
 * <tr class="row-odd">
 * <td>ResourceType</td>
 * <td>String</td>
 * <td>绑定防火墙组的资源类型，如uhost</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-even">
 * <td>ResourceId</td>
 * <td>Integer</td>
 * <td>绑定防火墙组的资源ID</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-odd">
 * <td>GroupId</td>
 * <td>String</td>
 * <td>防火墙ID</td>
 * <td>No</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 */
public class DescribeSecurityGroupRequest implements
		UCloudRequest<DescribeSecurityGroupResponse> {

	private static final String ACTION = "DescribeSecurityGroup";

	@NotNull
	private String region;
	private ResourceType resourceType;
	private String resourceId;
	private String groupId;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
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
		map.put("ResourceType", resourceType);
		map.put("ResourceId", resourceId);
		map.put("GroupId", groupId);
		return map;
	}

	@Override
	public Class<DescribeSecurityGroupResponse> getResponseClass() {
		return DescribeSecurityGroupResponse.class;
	}

}
