package cn.ucloud.api.ufile.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import com.alibaba.fastjson.annotation.JSONField;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.ufile.response.CreateBucketResponse;
import cn.ucloud.api.ufile.response.DescribeBucketResponse;

/**
 * 获取Bucket的描述信息
 * 
 * @author pingqc
 *
 */
public class DescribeBucketRequest implements UCloudRequest<DescribeBucketResponse> {

	private String bucketName;
	private Integer offset;
	private Integer limit;

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@Override
	public String getAction() {
		return "DescribeBucket";
	}

	@Override
	public void check() throws InvalidRequestException {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Action", getAction());
		map.put("BucketName", bucketName);
		map.put("Offset", offset);
		map.put("Limit", limit);
		return map;
	}

	@Override
	public Class<DescribeBucketResponse> getResponseClass() {
		return DescribeBucketResponse.class;
	}

}
