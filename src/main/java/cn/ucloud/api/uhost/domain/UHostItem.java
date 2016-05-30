package cn.ucloud.api.uhost.domain;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import cn.ucloud.api.unet.domain.ChargeType;

/**
 * UHost实例
 * 
 * @author pingqc
 *
 */
public class UHostItem implements Serializable {

	@JSONField(name = "UHostId")
	private String uhostId;
	@JSONField(name = "UHostType")
	private UHostType uHostType;
	@JSONField(name = "OsType")
	private String osType;
	@JSONField(name = "ImageId")
	private String imageId;
	@JSONField(name = "BasicImageId")
	private String basicImageId;
	@JSONField(name = "BasicImageName")
	private String basicImageName;
	@JSONField(name = "Tag")
	private String tag;
	@JSONField(name = "Remark")
	private String remark;
	@JSONField(name = "Name")
	private String name;
	@JSONField(name = "State")
	private UHostState state;
	@JSONField(name = "CreateTime")
	private Integer createTime;
	@JSONField(name = "ChargeType")
	private ChargeType chargeType;
	@JSONField(name = "ExpireTime")
	private Integer expireTime;
	@JSONField(name = "CPU")
	private Integer cpu;
	@JSONField(name = "Memory")
	private Integer memory;
	@JSONField(name = "DiskSet")
	private List<DiskInfo> diskSet;
	@JSONField(name = "IPSet")
	private List<IPInfo> ipSet;

	public String getUhostId() {
		return uhostId;
	}

	public UHostType getuHostType() {
		return uHostType;
	}

	public void setuHostType(UHostType uHostType) {
		this.uHostType = uHostType;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getBasicImageId() {
		return basicImageId;
	}

	public void setBasicImageId(String basicImageId) {
		this.basicImageId = basicImageId;
	}

	public String getBasicImageName() {
		return basicImageName;
	}

	public void setBasicImageName(String basicImageName) {
		this.basicImageName = basicImageName;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UHostState getState() {
		return state;
	}

	public void setState(UHostState state) {
		this.state = state;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public ChargeType getChargeType() {
		return chargeType;
	}

	public void setChargeType(ChargeType chargeType) {
		this.chargeType = chargeType;
	}

	public Integer getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getCpu() {
		return cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public List<DiskInfo> getDiskSet() {
		return diskSet;
	}

	public void setDiskSet(List<DiskInfo> diskSet) {
		this.diskSet = diskSet;
	}

	public List<IPInfo> getIpSet() {
		return ipSet;
	}

	public void setIpSet(List<IPInfo> ipSet) {
		this.ipSet = ipSet;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

}
