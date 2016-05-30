package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.domain.LoginMode;
import cn.ucloud.api.uhost.domain.ReserveDisk;
import cn.ucloud.api.uhost.response.ReinstallUHostInstanceResponse;
import cn.ucloud.api.unet.domain.ChargeType;
import cn.ucloud.api.util.StringUtils;

/**
 * 
 * 重新安装指定UHost实例的操作系统
 * 
 * @author pingqc
 */
public class ReinstallUHostInstanceRequest implements
		UCloudRequest<ReinstallUHostInstanceResponse> {

	private static final String ACTION = "ReinstallUHostInstance";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;
	private String password;
	private String imageId;
	private ReserveDisk reserveDisk;

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

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public ReserveDisk getReserveDisk() {
		return reserveDisk;
	}

	public void setReserveDisk(ReserveDisk reserveDisk) {
		this.reserveDisk = reserveDisk;
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
		map.put("ImageId", imageId);
		map.put("ReserveDisk", reserveDisk);
		return map;
	}

	@Override
	public Class<ReinstallUHostInstanceResponse> getResponseClass() {
		return ReinstallUHostInstanceResponse.class;
	}

}
