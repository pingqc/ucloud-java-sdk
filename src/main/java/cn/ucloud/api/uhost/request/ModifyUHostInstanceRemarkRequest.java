package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.ModifyUHostInstanceRemarkResponse;

/**
 * 修改指定UHost实例业务组标识。
 * 
 * @author pingqc
 */
public class ModifyUHostInstanceRemarkRequest implements
		UCloudRequest<ModifyUHostInstanceRemarkResponse> {

	private static final String ACTION = "ModifyUHostInstanceRemark";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;
	@NotNull
	private String remark;

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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
		map.put("Remark", remark);
		return map;
	}

	@Override
	public Class<ModifyUHostInstanceRemarkResponse> getResponseClass() {
		return ModifyUHostInstanceRemarkResponse.class;
	}

}
