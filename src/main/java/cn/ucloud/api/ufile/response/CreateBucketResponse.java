package cn.ucloud.api.ufile.response;

import com.alibaba.fastjson.annotation.JSONField;

import cn.ucloud.api.UCloudResponse;

/**
 * 创建Bucket
 * @author pingqc
 *
 */
public class CreateBucketResponse extends UCloudResponse {

	@JSONField(name = "BucketName")
	private String bucketName;

	@JSONField(name = "BucketId")
	private String bucketId;

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketId() {
		return bucketId;
	}

	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}

}
