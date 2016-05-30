package cn.ucloud.api.ufile.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.ufile.response.CreateBucketResponse;

/**
 * 创建Bucket
 * 
 * @author pingqc
 *
 */
public class CreateBucketRequest implements UCloudRequest<CreateBucketResponse> {

	@NotNull
	private String bucketName;

	private String type;
	private String[] domains;

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

	public String[] getDomains() {
		return domains;
	}

	public void setDomains(String[] domains) {
		this.domains = domains;
	}

	@Override
	public String getAction() {
		return "CreateBucket";
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
		if (domains != null && domains.length > 0) {
			for (int i = 0; i < domains.length; i++) {
				map.put("MetricName." + i, domains[i]);
			}
		}
		map.put("Type", type);
		return map;
	}

	@Override
	public Class<CreateBucketResponse> getResponseClass() {
		return CreateBucketResponse.class;
	}

}
