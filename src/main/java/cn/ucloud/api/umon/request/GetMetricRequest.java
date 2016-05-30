package cn.ucloud.api.umon.request;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.umon.response.GetMetricResponse;

/**
 * 获取监控数据
 * 
 * @author pingqc
 */
public class GetMetricRequest implements UCloudRequest<GetMetricResponse> {

	private static final String ACTION = "GetMetric";
	
	@NotNull
	private String region;

	//标准/hibernate提供的constraints不能对数组元素的长度进行校验，后面考虑自己实现
	//参考http://www.ibm.com/developerworks/cn/java/j-lo-jsr303/
	@NotNull
	private String[] metricNames;
	
	@NotNull
	@Length(min = 1, max = 255)
	private String resourceId;
	
	@NotNull
	@Length(min = 1, max = 255)
	private String resourceType;

	private Integer timeRange;
	
	private Integer beginTime;
	
	private Integer endTime;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String[] getMetricNames() {
		return metricNames;
	}

	public void setMetricNames(String[] metricNames) {
		this.metricNames = metricNames;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public Integer getTimeRange() {
		return timeRange;
	}

	public void setTimeRange(Integer timeRange) {
		this.timeRange = timeRange;
	}

	public Integer getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Integer beginTime) {
		this.beginTime = beginTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	@Override
	public String getAction() {
		return ACTION;
	}

	@Override
	public void check() throws InvalidRequestException {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<GetMetricRequest>> violations = validator.validate(this);
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for(ConstraintViolation<GetMetricRequest> item: violations) {
			flag = true;
			sb.append("\n").append(item.getPropertyPath()).append(" ").append(item.getMessage());
		}
		if(flag) {
			throw new InvalidRequestException("请求参数不合法：" + sb);
		}
	}

	public static void main(String[] args) {
		GetMetricRequest req = new GetMetricRequest();
		try {
			req.check();
		} catch (InvalidRequestException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Map<String, Object> getTextParams() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Action", getAction());
		map.put("Region", region);
		if(metricNames != null && metricNames.length > 0) {
			for(int i = 0; i < metricNames.length; i++) {
				map.put("MetricName." + i, metricNames[i]);
			}
		}
		map.put("ResourceType", resourceType);
		map.put("ResourceId", resourceId);
		map.put("TimeRange", timeRange);
		map.put("BeginTime", beginTime);
		map.put("EndTime", endTime);
		
		return map;
	}

	@Override
	public Class<GetMetricResponse> getResponseClass() {
		return GetMetricResponse.class;
	}

}
