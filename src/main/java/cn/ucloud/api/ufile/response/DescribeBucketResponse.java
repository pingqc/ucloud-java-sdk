package cn.ucloud.api.ufile.response;

import java.util.List;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.ufile.domain.BucketDescInfo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取Bucket的描述信息
 * 
 * @author pingqc
 *
 */
public class DescribeBucketResponse extends UCloudResponse {

	@JSONField(name = "DataSet")
	private List<BucketDescInfo> dataSet;

	public List<BucketDescInfo> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<BucketDescInfo> dataSet) {
		this.dataSet = dataSet;
	}

}
