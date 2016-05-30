package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.StopUHostInstanceResponse;

/**
 * 指停止处于运行状态的UHost实例，需指定数据中心及UhostID。
 * 
 * @author pingqc
 */
public class StopUHostInstanceRequest implements
		UCloudRequest<StopUHostInstanceResponse> {

	private static final String ACTION = "StopUHostInstance";

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
	public Class<StopUHostInstanceResponse> getResponseClass() {
		return StopUHostInstanceResponse.class;
	}

}
