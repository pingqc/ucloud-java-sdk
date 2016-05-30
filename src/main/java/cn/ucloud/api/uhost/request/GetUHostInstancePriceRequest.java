package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.GetUHostInstancePriceResponse;
import cn.ucloud.api.unet.domain.ChargeType;

/**
 * 根据UHost实例配置，获取UHost实例的价格。
 * 
 * @author pingqc
 */
public class GetUHostInstancePriceRequest implements
		UCloudRequest<GetUHostInstancePriceResponse> {

	private static final String ACTION = "GetUHostInstancePrice";

	@NotNull
	private String region;
	@NotNull
	private String imageId;
	@NotNull
	@Range(min = 1, max = 16)
	private Integer cpu;
	@NotNull
	@Range(min = 2048, max = 65536)
	private Integer memory;
	@NotNull
	@Range(min = 1, max = 5)
	private Integer count;
	private ChargeType chargeType;
	@Range(min = 0, max = 1000)
	private Integer diskSpace;

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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public ChargeType getChargeType() {
		return chargeType;
	}

	public void setChargeType(ChargeType chargeType) {
		this.chargeType = chargeType;
	}

	public Integer getDiskSpace() {
		return diskSpace;
	}

	public void setDiskSpace(Integer diskSpace) {
		this.diskSpace = diskSpace;
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
		map.put("CPU", cpu);
		map.put("Memory", memory);
		map.put("Count", count);
		map.put("ChargeType", chargeType);
		map.put("DiskSpace", diskSpace);
		return map;
	}

	@Override
	public Class<GetUHostInstancePriceResponse> getResponseClass() {
		return GetUHostInstancePriceResponse.class;
	}

}
