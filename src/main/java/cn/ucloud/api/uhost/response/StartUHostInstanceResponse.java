package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 启动处于关闭状态的UHost实例，需要指定数据中心及UHostID两个参数的值。
 * 
 * @author pingqc
 *
 */
public class StartUHostInstanceResponse extends UCloudResponse {

	@JSONField(name = "UHostId")
	private String uhostId;

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

}
