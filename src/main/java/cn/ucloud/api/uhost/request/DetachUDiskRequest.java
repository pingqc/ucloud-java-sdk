package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.DetachUDiskResponse;

/**
 * 卸载某个已经挂载在指定UHost实例上的UDisk
 * 
 * @author pingqc
 */
public class DetachUDiskRequest implements UCloudRequest<DetachUDiskResponse> {

	private static final String ACTION = "DetachUDisk";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;
	@NotNull
	private String udiskId;

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

	public String getUdiskId() {
		return udiskId;
	}

	public void setUdiskId(String udiskId) {
		this.udiskId = udiskId;
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
		map.put("UDiskId", udiskId);
		return map;
	}

	@Override
	public Class<DetachUDiskResponse> getResponseClass() {
		return DetachUDiskResponse.class;
	}

}
