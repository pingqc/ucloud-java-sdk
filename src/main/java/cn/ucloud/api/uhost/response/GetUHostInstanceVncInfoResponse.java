package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取指定UHost实例的管理VNC配置详细信息。
 * 
 * @author pingqc
 *
 */
public class GetUHostInstanceVncInfoResponse extends UCloudResponse {

	@JSONField(name = "UHostId")
	private String uhostId;
	@JSONField(name = "VncIP")
	private String vncIp;
	@JSONField(name = "VncPort")
	private Integer vncPort;
	@JSONField(name = "VncPassword")
	private String vncPassword;

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

	public String getVncIp() {
		return vncIp;
	}

	public void setVncIp(String vncIp) {
		this.vncIp = vncIp;
	}

	public Integer getVncPort() {
		return vncPort;
	}

	public void setVncPort(Integer vncPort) {
		this.vncPort = vncPort;
	}

	public String getVncPassword() {
		return vncPassword;
	}

	public void setVncPassword(String vncPassword) {
		this.vncPassword = vncPassword;
	}

}
