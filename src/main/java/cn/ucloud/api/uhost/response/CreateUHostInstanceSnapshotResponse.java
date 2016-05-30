package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 对指定UHost实例制作数据快照。
 * 
 * @author pingqc
 *
 */
public class CreateUHostInstanceSnapshotResponse extends UCloudResponse {

	@JSONField(name = "UhostId")
	private String uhostId;
	@JSONField(name = "SnapshotName")
	private String snapshotName;

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

	public String getSnapshotName() {
		return snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
	}

}
