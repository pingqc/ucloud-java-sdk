package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除用户自定义镜像
 * 
 * @author pingqc
 *
 */
public class TerminateCustomImageResponse extends UCloudResponse {

	@JSONField(name = "ImageId")
	private String imageId;

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

}
