package cn.ucloud.api.unet.response;

import java.util.List;
import java.util.Map;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.umon.domain.MetricItem;
import cn.ucloud.api.unet.domain.EIPSet;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 根据提供信息，分配弹性IP
 * 
 * @author pingqc
 *
 */
public class AllocateEIPResponse extends UCloudResponse {

	@JSONField(name = "EIPIds")
	private List<String> eipIds;

	@JSONField(name = "EIPSet")
	private List<EIPSet> eipSet;

	public List<String> getEipIds() {
		return eipIds;
	}

	public void setEipIds(List<String> eipIds) {
		this.eipIds = eipIds;
	}

	public List<EIPSet> getEipSet() {
		return eipSet;
	}

	public void setEipSet(List<EIPSet> eipSet) {
		this.eipSet = eipSet;
	}

}
