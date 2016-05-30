package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 指停止处于运行状态的UHost实例，需指定数据中心及UhostID。
 * 
 * @author pingqc
 *
 */
public class StopUHostInstanceResponse extends UCloudResponse {

	@JSONField(name = "UHostId")
	private String uhostId;

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

}
