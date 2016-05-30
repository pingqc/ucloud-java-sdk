package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.apache.commons.codec.binary.Base64;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.ResetUHostInstancePasswordResponse;
import cn.ucloud.api.util.StringUtils;

/**
 * 重置UHost实例的管理员密码。
 * 
 * @author pingqc
 */
public class ResetUHostInstancePasswordRequest implements
		UCloudRequest<ResetUHostInstancePasswordResponse> {

	private static final String ACTION = "ResetUHostInstancePassword";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;
	@NotNull
	private String password;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		map.put("Password", StringUtils.encodeBase64(password));
		return map;
	}

	@Override
	public Class<ResetUHostInstancePasswordResponse> getResponseClass() {
		return ResetUHostInstancePasswordResponse.class;
	}

}
