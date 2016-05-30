package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.response.AllocateVIPResponse;

/**
 * 将弹性IP绑定到资源上
 * <table class="docutils" border="1">
 * <colgroup> <col width="18%"> <col width="10%"> <col width="61%"> <col
 * width="11%"> </colgroup> <thead valign="bottom">
 * <tr class="row-odd">
 * <th class="head">Parameter name</th>
 * <th class="head">Type</th>
 * <th class="head">Description</th>
 * <th class="head">Required</th>
 * </tr>
 * </thead> <tbody valign="top">
 * <tr class="row-even">
 * <td>Region</td>
 * <td>String</td>
 * <td>数据中心，参见 <a class="reference external"
 * href="../regionlist.html">数据中心列表</a></td>
 * <td>Yes</td>
 * </tr>
 * <tr class="row-odd">
 * <td>Count</td>
 * <td>Integer</td>
 * <td>申请数量，默认: 1</td>
 * <td>No</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 */
public class AllocateVIPRequest implements UCloudRequest<AllocateVIPResponse> {

	private static final String ACTION = "AllocateVIP";

	@NotNull
	private String region;

	private Integer count;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
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
		map.put("Count", count);

		return map;
	}

	@Override
	public Class<AllocateVIPResponse> getResponseClass() {
		return AllocateVIPResponse.class;
	}

}
