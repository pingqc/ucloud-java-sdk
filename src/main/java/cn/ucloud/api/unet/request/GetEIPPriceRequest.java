package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.domain.ChargeType;
import cn.ucloud.api.unet.domain.IPType;
import cn.ucloud.api.unet.response.GetEIPPriceResponse;

/**
 * 将弹性IP绑定到资源上
 * 
 * @author pingqc
 */
public class GetEIPPriceRequest implements UCloudRequest<GetEIPPriceResponse> {

	private static final String ACTION = "GetEIPPrice";

	@NotNull
	private String region;
	@NotNull
	private IPType operatorName;
	@NotNull
	@Size(min = 0, max = 800)
	private Integer bandwidth;
	private ChargeType chargeType;

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

		return map;
	}

	@Override
	public Class<GetEIPPriceResponse> getResponseClass() {
		return GetEIPPriceResponse.class;
	}

}
