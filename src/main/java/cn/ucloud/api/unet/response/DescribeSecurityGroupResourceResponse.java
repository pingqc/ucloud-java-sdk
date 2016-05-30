package cn.ucloud.api.unet.response;

import java.util.List;
import java.util.Map;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.umon.domain.MetricItem;
import cn.ucloud.api.unet.domain.EIPSet;
import cn.ucloud.api.unet.domain.FirewallInfo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取防火墙组所绑定资源的外网IP
 * 
 * @author pingqc
 *
 */
public class DescribeSecurityGroupResourceResponse extends UCloudResponse {

	@JSONField(name = "DataSet")
	private List<String> dataSet;

	public List<String> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<String> dataSet) {
		this.dataSet = dataSet;
	}

}
