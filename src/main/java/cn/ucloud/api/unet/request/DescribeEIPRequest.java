package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.domain.ChargeType;
import cn.ucloud.api.unet.domain.IPType;
import cn.ucloud.api.unet.response.AllocateEIPResponse;
import cn.ucloud.api.unet.response.DescribeEIPResponse;

/**
 * 获取弹性IP详细信息
 * 
 * @author pingqc
 */
public class DescribeEIPRequest implements UCloudRequest<DescribeEIPResponse> {

	private static final String ACTION = "DescribeEIP";

	@NotNull
	private String region;
	private String[] eipIds;
	private Integer offset;
	private Integer limit;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String[] getEipIds() {
		return eipIds;
	}

	public void setEipIds(String[] eipIds) {
		this.eipIds = eipIds;
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
		if(eipIds != null && eipIds.length > 0) {
			for(int i = 0; i < eipIds.length; i++) {
				map.put("EIPIds." + i, eipIds[i]);
			}
		}
		map.put("Offset", offset);
		map.put("Limit", limit);
		return map;
	}

	@Override
	public Class<DescribeEIPResponse> getResponseClass() {
		return DescribeEIPResponse.class;
	}

}
