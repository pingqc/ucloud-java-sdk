package cn.ucloud.api.uhost.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 磁盘信息
 * 
 * @author pingqc
 *
 */
public class DiskInfo {

	@JSONField(name = "Type")
	private DiskType type;
	@JSONField(name = "DiskId")
	private String diskId;
	@JSONField(name = "Size")
	private Integer size;

	public DiskType getType() {
		return type;
	}

	public void setType(DiskType type) {
		this.type = type;
	}

	public String getDiskId() {
		return diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

}
