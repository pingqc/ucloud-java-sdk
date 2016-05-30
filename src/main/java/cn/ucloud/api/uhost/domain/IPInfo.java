package cn.ucloud.api.uhost.domain;

import com.alibaba.fastjson.annotation.JSONField;

import cn.ucloud.api.unet.domain.IPType;

/**
 * IP信息
 * 
 * @author pingqc
 *
 */
public class IPInfo {

	@JSONField(name = "Type")
	private IPType type;
	@JSONField(name = "IPId")
	private String ipId;
	@JSONField(name = "IP")
	private String ip;
	@JSONField(name = "bandwidth")
	private Integer bandwidth;

	public IPType getType() {
		return type;
	}

	public void setType(IPType type) {
		this.type = type;
	}

	public String getIpId() {
		return ipId;
	}

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

}
