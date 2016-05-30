package cn.ucloud.api.unet.domain;

import cn.ucloud.api.umon.domain.ResourceType;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 弹性IP的详细信息列表
 * @author pingqc
 *
 */
public class EIPResource {

	@JSONField(name = "ResourceType")
	private ResourceType resourceType;
	@JSONField(name = "ResourceName")
	private String resourceName;
	@JSONField(name = "ResourceId")
	private String resourceId;

	public ResourceType getResourceType() {
		return resourceType;
	}

	public void setResourceType(ResourceType resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

}
