package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.DescribeUHostInstanceResponse;

/**
 * 获取监控数据
 * 
 * @author pingqc
 */
public class DescribeUHostInstanceRequest implements
		UCloudRequest<DescribeUHostInstanceResponse> {

	private static final String ACTION = "DescribeUHostInstance";

	@NotNull
	private String region;
	private String[] uhostIds;
	private Integer offset;
	private Integer limit;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}


	public String[] getUhostIds() {
		return uhostIds;
	}

	public void setUhostIds(String[] uhostIds) {
		this.uhostIds = uhostIds;
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
		if (uhostIds != null && uhostIds.length > 0) {
			for (int i = 0; i < uhostIds.length; i++) {
				map.put("MetricName." + i, uhostIds[i]);
			}
		}
		map.put("Offset", offset);
		map.put("Limit", limit);
		return map;
	}

	@Override
	public Class<DescribeUHostInstanceResponse> getResponseClass() {
		return DescribeUHostInstanceResponse.class;
	}

}
