package cn.ucloud.api.umon.response;

import java.util.Map;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.umon.domain.MetricItem;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取监控数据
 * @author pingqc
 *
 */
public class GetMetricResponse extends UCloudResponse {

	@JSONField(name = "DataSets")
	private Map<String, MetricItem[]> dataSet;

	public Map<String, MetricItem[]> getDataSet() {
		return dataSet;
	}

	public void setDataSet(Map<String, MetricItem[]> dataSet) {
		this.dataSet = dataSet;
	}

}
