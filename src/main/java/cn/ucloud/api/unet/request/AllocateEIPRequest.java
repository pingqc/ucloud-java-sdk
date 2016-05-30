package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.domain.ChargeType;
import cn.ucloud.api.unet.domain.IPType;
import cn.ucloud.api.unet.response.AllocateEIPResponse;

/**
 * 获取监控数据
 * 
 * @author pingqc
 */
public class AllocateEIPRequest implements UCloudRequest<AllocateEIPResponse> {

	private static final String ACTION = "AllocateEIP";

	@NotNull
	private String region;
	@NotNull
	private IPType operatorName;
	@NotNull
	@Max(value = 800)
	private Integer bandwidth;
	private ChargeType chargeType;
	private Integer quantity;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public IPType getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(IPType operatorName) {
		this.operatorName = operatorName;
	}

	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public ChargeType getChargeType() {
		return chargeType;
	}

	public void setChargeType(ChargeType chargeType) {
		this.chargeType = chargeType;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String getAction() {
		return ACTION;
	}

	@Override
	public void check() throws InvalidRequestException {
		// TODO check
	}

	@Override
	public Map<String, Object> getTextParams() {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Action", getAction());
		map.put("Region", region);
		map.put("OperatorName", operatorName);
		map.put("Bandwidth", bandwidth);
		map.put("ChargeType", chargeType);
		map.put("Quantity", quantity);

		return map;
	}

	@Override
	public Class<AllocateEIPResponse> getResponseClass() {
		return AllocateEIPResponse.class;
	}

}
