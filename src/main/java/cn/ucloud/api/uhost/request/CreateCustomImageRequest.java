package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.CreateCustomImageResponse;

/**
 * 从指定UHost实例，生成自定义镜像。
 * 
 * @author pingqc
 */
public class CreateCustomImageRequest implements
		UCloudRequest<CreateCustomImageResponse> {

	private static final String ACTION = "CreateCustomImage";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;
	@NotNull
	private String imageName;
	private String imageDescription;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageDescription() {
		return imageDescription;
	}

	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
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
		map.put("UHostId", uhostId);
		map.put("ImageName", imageName);
		map.put("ImageDescription", imageDescription);
		return map;
	}

	@Override
	public Class<CreateCustomImageResponse> getResponseClass() {
		return CreateCustomImageResponse.class;
	}

}
