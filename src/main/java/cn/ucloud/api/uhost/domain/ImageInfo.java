package cn.ucloud.api.uhost.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 镜像信息
 * 
 * @author pingqc
 *
 */
public class ImageInfo {

	@JSONField(name = "ImageId")
	private String imageId;
	@JSONField(name = "ImageName")
	private String imageName;
	@JSONField(name = "OsType")
	private OsType osType;
	@JSONField(name = "OsName")
	private String osName;
	@JSONField(name = "ImageType")
	private ImageType imageType;
	@JSONField(name = "State")
	private ImageState state;
	@JSONField(name = "ImageDescription")
	private String imageDescription;
	@JSONField(name = "CreateTime")
	private Integer createTime;

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public OsType getOsType() {
		return osType;
	}

	public void setOsType(OsType osType) {
		this.osType = osType;
	}

	public ImageType getImageType() {
		return imageType;
	}

	public void setImageType(ImageType imageType) {
		this.imageType = imageType;
	}

	public ImageState getState() {
		return state;
	}

	public void setState(ImageState state) {
		this.state = state;
	}

	public String getImageDescription() {
		return imageDescription;
	}

	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

}
