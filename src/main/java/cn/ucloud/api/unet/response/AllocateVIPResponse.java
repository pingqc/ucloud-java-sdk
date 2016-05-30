package cn.ucloud.api.unet.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.unet.domain.EIPPrice;

/**
 * 根据提供信息，分配内网VIP(Virtual IP，多用于高可用程序作为漂移IP。)
 * 
 * @author pingqc
 *
 */
public class AllocateVIPResponse extends UCloudResponse {

	@JSONField(name = "DataSet")
	private List<String> dataSet;

	public List<String> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<String> dataSet) {
		this.dataSet = dataSet;
	}

}
