package cn.ucloud.api.uhost.response;

import java.util.List;
import java.util.Map;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.uhost.domain.UHostItem;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取主机或主机列表信息，并可根据数据中心，主机ID等参数进行过滤。
 * 
 * @author pingqc
 *
 */
public class DescribeUHostInstanceResponse extends UCloudResponse {

	@JSONField(name = "TotalCount")
	private Integer totalCount;
	@JSONField(name = "UHostSet")
	private List<UHostItem> uhostSet;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<UHostItem> getUhostSet() {
		return uhostSet;
	}

	public void setUhostSet(List<UHostItem> uhostSet) {
		this.uhostSet = uhostSet;
	}

}
