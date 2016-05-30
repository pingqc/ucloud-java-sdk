package cn.ucloud.api.unet.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.unet.domain.EIPPrice;

/**
 * 获取内网VIP详细信息
 * 
 * @author pingqc
 *
 */
public class DescribeVIPResponse extends UCloudResponse {

	@JSONField(name = "DataSet")
	private List<String> dataSet;

	public List<String> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<String> dataSet) {
		this.dataSet = dataSet;
	}

}
