package cn.ucloud.api.unet.response;

import java.util.List;
import java.util.Map;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.umon.domain.MetricItem;
import cn.ucloud.api.unet.domain.EIPSet;
import cn.ucloud.api.unet.domain.FirewallInfo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取防火墙组信息
 * 
 * @author pingqc
 *
 */
public class DescribeSecurityGroupResponse extends UCloudResponse {

	@JSONField(name = "DataSet")
	private List<FirewallInfo> dataSet;

	public List<FirewallInfo> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<FirewallInfo> dataSet) {
		this.dataSet = dataSet;
	}

}
