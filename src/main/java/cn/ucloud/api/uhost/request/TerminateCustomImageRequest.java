package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.TerminateCustomImageResponse;

/**
 * 删除用户自定义镜像
 * 
 * @author pingqc
 */
public class TerminateCustomImageRequest implements
		UCloudRequest<TerminateCustomImageResponse> {

	private static final String ACTION = "TerminateCustomImage";

	@NotNull
	private String region;
	@NotNull
	private String imageId;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
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
		map.put("ImageId", imageId);
		return map;
	}

	@Override
	public Class<TerminateCustomImageResponse> getResponseClass() {
		return TerminateCustomImageResponse.class;
	}

}
