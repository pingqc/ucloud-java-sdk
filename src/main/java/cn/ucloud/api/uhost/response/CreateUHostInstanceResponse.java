package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 指定数据中心，根据资源使用量创建指定数量的UHost实例。
 * 
 * @author pingqc
 *
 */
public class CreateUHostInstanceResponse extends UCloudResponse {

	@JSONField(name = "UHostIds")
	private String[] uhostIds;

	public String[] getUhostIds() {
		return uhostIds;
	}

	public void setUhostIds(String[] uhostIds) {
		this.uhostIds = uhostIds;
	}

}
