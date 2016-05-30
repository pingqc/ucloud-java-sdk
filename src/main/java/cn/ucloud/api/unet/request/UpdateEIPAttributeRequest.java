package cn.ucloud.api.unet.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.unet.response.UpdateEIPAttributeResponse;

/**
 * 修改EIP名字业务组备注等属性字段<br/>
 * <table class="docutils" border="1">
 * <colgroup> <col width="18%"> <col width="9%"> <col width="61%"> <col
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
 * <td>EIPId</td>
 * <td>String</td>
 * <td>EIP资源ID</td>
 * <td>Yes</td>
 * </tr>
 * <tr class="row-even">
 * <td>Name</td>
 * <td>String</td>
 * <td>名字（Name Tag Remark都为空则报错）</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-odd">
 * <td>Tag</td>
 * <td>String</td>
 * <td>弹性IP的业务组标识</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-even">
 * <td>Remark</td>
 * <td>String</td>
 * <td>弹性IP的备注信息</td>
 * <td>No</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 */
public class UpdateEIPAttributeRequest implements
		UCloudRequest<UpdateEIPAttributeResponse> {

	private static final String ACTION = "UpdateEIPAttribute";

	@NotNull
	private String region;
	@NotNull
	private String eipId;
	private String name;
	private String tag;
	private String remark;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEipId() {
		return eipId;
	}

	public void setEipId(String eipId) {
		this.eipId = eipId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
		map.put("EIPId", eipId);
		map.put("Name", name);
		map.put("Tag", tag);
		map.put("Remark", remark);

		return map;
	}

	@Override
	public Class<UpdateEIPAttributeResponse> getResponseClass() {
		return UpdateEIPAttributeResponse.class;
	}

}
