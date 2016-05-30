package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.ModifyUHostInstanceNameResponse;
import cn.ucloud.api.util.StringUtils;

/**
 * 修改指定UHost实例名称，需要给出数据中心，UHostId，及新的实例名称。
 * 
 * @author pingqc
 */
public class ModifyUHostInstanceNameRequest implements
		UCloudRequest<ModifyUHostInstanceNameResponse> {

	private static final String ACTION = "ModifyUHostInstanceName";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;
	@NotNull
	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		map.put("Name", name);
		return map;
	}

	@Override
	public Class<ModifyUHostInstanceNameResponse> getResponseClass() {
		return ModifyUHostInstanceNameResponse.class;
	}

}
