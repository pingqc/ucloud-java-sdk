package cn.ucloud.api.uhost.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * UHost快照信息
 * 
 * @author pingqc
 *
 */
public class UHostSnapshotInfo {

	@JSONField(name = "SnapshotName")
	private String SnapshotName;
	@JSONField(name = "SnapshotTime")
	private Long snapshotTime;

	public String getSnapshotName() {
		return SnapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		SnapshotName = snapshotName;
	}

	public Long getSnapshotTime() {
		return snapshotTime;
	}

	public void setSnapshotTime(Long snapshotTime) {
		this.snapshotTime = snapshotTime;
	}

}
