package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.RebootUHostInstanceResponse;

/**
 * 重新启动UHost实例，需要指定数据中心及UHostID两个参数的值。
 * 
 * @author pingqc
 */
public class RebootUHostInstanceRequest implements
		UCloudRequest<RebootUHostInstanceResponse> {

	private static final String ACTION = "RebootUHostInstance";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;

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
		return map;
	}

	@Override
	public Class<RebootUHostInstanceResponse> getResponseClass() {
		return RebootUHostInstanceResponse.class;
	}

}
