package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 卸载某个已经挂载在指定UHost实例上的UDisk
 * 
 * @author pingqc
 *
 */
public class DetachUDiskResponse extends UCloudResponse {

	@JSONField(name = "UhostId")
	private String uhostId;
	@JSONField(name = "UDiskId")
	private String udiskId;

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

}
