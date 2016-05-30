package cn.ucloud.api.uhost.response;

import java.util.List;
import java.util.Map;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.uhost.domain.UHostItem;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除指定数据中心的UHost实例。
 * 
 * @author pingqc
 *
 */
public class TerminateUHostInstanceResponse extends UCloudResponse {

	@JSONField(name = "UHostIds")
	private String[] uhostIds;

	public String[] getUhostIds() {
		return uhostIds;
	}

	public void setUhostIds(String[] uhostIds) {
		this.uhostIds = uhostIds;
	}

}
