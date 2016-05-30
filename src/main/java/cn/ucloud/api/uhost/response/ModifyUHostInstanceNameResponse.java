package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 修改指定UHost实例名称，需要给出数据中心，UHostId，及新的实例名称。
 * 
 * @author pingqc
 *
 */
public class ModifyUHostInstanceNameResponse extends UCloudResponse {

	@JSONField(name = "UHostId")
	private String uhostId;

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

}
