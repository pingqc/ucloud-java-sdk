package cn.ucloud.api.uhost.response;

import java.util.List;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.uhost.domain.ImageInfo;
import cn.ucloud.api.uhost.domain.PriceInfo;
import cn.ucloud.api.uhost.domain.UHostSnapshotInfo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取已经存在的UHost实例的存储快照列表。
 * 
 * @author pingqc
 *
 */
public class DescribeUHostInstanceSnapshotResponse extends UCloudResponse {

	@JSONField(name = "")
	private String uhostId;
	@JSONField(name = "SnapshotSet")
	private List<UHostSnapshotInfo> snapshotSet;

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

	public List<UHostSnapshotInfo> getSnapshotSet() {
		return snapshotSet;
	}

	public void setSnapshotSet(List<UHostSnapshotInfo> snapshotSet) {
		this.snapshotSet = snapshotSet;
	}

}
