package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 修改指定UHost实例备注信息。
 * 
 * @author pingqc
 *
 */
public class ModifyUHostInstanceRemarkResponse extends UCloudResponse {

	@JSONField(name = "UHostId")
	private String uhostId;

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

}
