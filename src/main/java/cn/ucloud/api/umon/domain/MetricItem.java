package cn.ucloud.api.umon.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * @author pingqc
 * @since 0.0.1
 */
public class MetricItem {

	@JSONField(name = "IP")
	private String ip;

	@JSONField(name = "Timestamp")
	private Integer timestamp;

	@JSONField(name = "Value")
	private Float value;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}
}
