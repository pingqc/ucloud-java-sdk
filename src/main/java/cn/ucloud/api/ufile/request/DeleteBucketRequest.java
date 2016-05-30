package cn.ucloud.api.ufile.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.ufile.response.DeleteBucketResponse;

/**
 * 删除Bucket
 * 
 * @author pingqc
 *
 */
public class DeleteBucketRequest implements UCloudRequest<DeleteBucketResponse> {

	@NotNull
	private String bucketName;

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	@Override
	public String getAction() {
		return "DeleteBucket";
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
		return map;
	}

	@Override
	public Class<DeleteBucketResponse> getResponseClass() {
		return DeleteBucketResponse.class;
	}

}
