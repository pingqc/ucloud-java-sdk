package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.AttachUDiskResponse;

/**
 * 将一个可用的UDisk挂载到某台主机上，当UDisk挂载成功后，还需要在主机内部进行文件系统操作。
 * 
 * @author pingqc
 */
public class AttachUDiskRequest implements UCloudRequest<AttachUDiskResponse> {

	private static final String ACTION = "AttachUDisk";

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
	public Class<AttachUDiskResponse> getResponseClass() {
		return AttachUDiskResponse.class;
	}

}
