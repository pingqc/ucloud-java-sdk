package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.CreateUHostInstanceSnapshotResponse;

/**
 * 对指定UHost实例制作数据快照。
 * 
 * @author pingqc
 */
public class CreateUHostInstanceSnapshotRequest implements
		UCloudRequest<CreateUHostInstanceSnapshotResponse> {

	private static final String ACTION = "CreateUHostInstanceSnapshot";

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
	public Class<CreateUHostInstanceSnapshotResponse> getResponseClass() {
		return CreateUHostInstanceSnapshotResponse.class;
	}

}
