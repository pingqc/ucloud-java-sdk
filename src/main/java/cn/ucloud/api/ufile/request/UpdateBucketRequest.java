package cn.ucloud.api.ufile.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.ufile.response.CreateBucketResponse;
import cn.ucloud.api.ufile.response.UpdateBucketResponse;

/**
 * 设置Bucket的属性
 * 
 * @author pingqc
 *
 */
public class UpdateBucketRequest implements UCloudRequest<UpdateBucketResponse> {

	@NotNull
	private String bucketName;

	private String type;

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getAction() {
		return "UpdateBucket";
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
		map.put("Type", type);
		return map;
	}

	@Override
	public Class<UpdateBucketResponse> getResponseClass() {
		return UpdateBucketResponse.class;
	}

}
