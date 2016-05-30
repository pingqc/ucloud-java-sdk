package cn.ucloud.api.unet.response;

import java.util.List;
import java.util.Map;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.umon.domain.MetricItem;
import cn.ucloud.api.unet.domain.EIPSet;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取弹性IP详细信息
 * 
 * @author pingqc
 *
 */
public class DescribeEIPResponse extends UCloudResponse {

	@JSONField(name = "TotalCount")
	private Integer totalCount;

	@JSONField(name = "EIPSet")
	private List<EIPSet> eipSet;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<EIPSet> getEipSet() {
		return eipSet;
	}

	public void setEipSet(List<EIPSet> eipSet) {
		this.eipSet = eipSet;
	}

}
