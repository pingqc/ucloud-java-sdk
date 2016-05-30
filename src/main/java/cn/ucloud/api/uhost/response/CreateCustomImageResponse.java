package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 从指定UHost实例，生成自定义镜像。
 * 
 * @author pingqc
 *
 */
public class CreateCustomImageResponse extends UCloudResponse {

	@JSONField(name = "ImageId")
	private String imageId;

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

}
