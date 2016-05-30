package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.response.DescribeVIPResponse;

/**
 * 获取内网VIP详细信息
 * 
 * @author pingqc
 */
public class DescribeVIPRequest implements UCloudRequest<DescribeVIPResponse> {

	private static final String ACTION = "DescribeVIP";

	@NotNull
	private String region;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
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
		return map;
	}

	@Override
	public Class<DescribeVIPResponse> getResponseClass() {
		return DescribeVIPResponse.class;
	}

}
