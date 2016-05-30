package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.domain.ImageType;
import cn.ucloud.api.uhost.domain.OsType;
import cn.ucloud.api.uhost.response.DescribeImageResponse;

/**
 * 获取指定数据中心镜像列表，用户可通过指定操作系统类型，镜像Id进行过滤。
 * 
 * @author pingqc
 */
public class DescribeImageRequest implements
		UCloudRequest<DescribeImageResponse> {

	private static final String ACTION = "DescribeImage";

	@NotNull
	private String region;
	private ImageType imageType;
	private OsType osType;
	private String imageId;
	private Integer offset;
	private Integer limit;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public ImageType getImageType() {
		return imageType;
	}

	public void setImageType(ImageType imageType) {
		this.imageType = imageType;
	}

	public OsType getOsType() {
		return osType;
	}

	public void setOsType(OsType osType) {
		this.osType = osType;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
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
		map.put("ImageType", imageType);
		map.put("OsType", osType);
		map.put("ImageId", imageId);
		map.put("Offset", offset);
		map.put("Limit", limit);
		return map;
	}

	@Override
	public Class<DescribeImageResponse> getResponseClass() {
		return DescribeImageResponse.class;
	}

}
