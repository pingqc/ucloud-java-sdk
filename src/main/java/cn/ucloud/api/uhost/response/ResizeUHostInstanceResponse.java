package cn.ucloud.api.uhost.response;

import cn.ucloud.api.UCloudResponse;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <pre>
 * 修改指定UHost实例的资源配置，如CPU核心数，内存容量大小，磁盘空间大小等。
 * 
 * 修改配置注意事项： 
 * 1.修改配置前，请确认该实例已经被关闭 
 * 2.修改磁盘空间大小后，请在启动后按照说明，进入操作系统进行操作。
 * </pre>
 * 
 * @author pingqc
 *
 */
public class ResizeUHostInstanceResponse extends UCloudResponse {

	@JSONField(name = "UHostId")
	private String uhostId;

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
	}

}
