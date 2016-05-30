package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.ModifyUHostInstanceTagResponse;

/**
 * 修改指定UHost实例业务组标识。
 * 
 * @author pingqc
 */
public class ModifyUHostInstanceTagRequest implements
		UCloudRequest<ModifyUHostInstanceTagResponse> {

	private static final String ACTION = "ModifyUHostInstanceTag";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;
	@NotNull
	private String tag;

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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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
		map.put("Tag", tag);
		return map;
	}

	@Override
	public Class<ModifyUHostInstanceTagResponse> getResponseClass() {
		return ModifyUHostInstanceTagResponse.class;
	}

}
