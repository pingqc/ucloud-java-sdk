package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 将一个可用的UDisk挂载到某台主机上，当UDisk挂载成功后，还需要在主机内部进行文件系统操作。
 * 
 * @author pingqc
 *
 */
public class AttachUDiskResponse extends UCloudResponse {

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
