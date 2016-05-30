package cn.ucloud.api.unet.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 申请到的EIP资源详情<br/>
 * <table border=1>
 * <thead valign="bottom">
 * <tr>
 * <th>Parameter Name</th>
 * <th>Type</th>
 * <th>Description</th>
 * </tr>
 * </thead> <tbody valign="top">
 * <tr>
 * <td>EIPId</td>
 * <td>String</td>
 * <td>弹性IP的资源ID</td>
 * </tr>
 * <tr>
 * <td>Weight</td>
 * <td>Integer</td>
 * <td>外网出口权重，默认为50，范围[0-100]</td>
 * </tr>
 * <tr>
 * <td>BandwidthType</td>
 * <td>Integer</td>
 * <td>带宽模式，枚举值为： 0：非共享带宽模式，1：共享带宽模式</td>
 * </tr>
 * <tr>
 * <td>Bandwidth</td>
 * <td>Integer</td>
 * <td>弹性IP的带宽，单位为Mbps，当BandwidthType=1时，该处显示为共享带宽值。</td>
 * </tr>
 * <tr>
 * <td>Status</td>
 * <td>String</td>
 * <td>弹性IP的资源绑定状态，枚举值为： used：已绑定，free：未绑定，freeze：已冻结</td>
 * </tr>
 * <tr>
 * <td>ChargeType</td>
 * <td>String</td>
 * <td>计费模式，枚举值为： Year，按年付费； Month，按月付费； Dynamic，按小时付费； Trial，试用</td>
 * </tr>
 * <tr>
 * <td>CreateTime</td>
 * <td>Integer</td>
 * <td>弹性IP的创建时间，格式为Unix Timestamp</td>
 * </tr>
 * <tr>
 * <td>ExpireTime</td>
 * <td>Integer</td>
 * <td>弹性IP的到期时间，格式为Unix Timestamp</td>
 * </tr>
 * <tr>
 * <td>Resource</td>
 * <td>Array</td>
 * <td>弹性IP的详细信息列表，具体结构见下方Resource</td>
 * </tr>
 * <tr>
 * <td>EIPAddr</td>
 * <td>Array</td>
 * <td>弹性IP的详细信息列表，具体结构见下方EIPAddr</td>
 * </tr>
 * <tr>
 * <td>Name</td>
 * <td>String</td>
 * <td>弹性IP的名称,缺省值为“EIP”</td>
 * </tr>
 * <tr>
 * <td>Tag</td>
 * <td>String</td>
 * <td>弹性IP的业务组标识，缺省值为“Default”</td>
 * </tr>
 * <tr>
 * <td>Remark</td>
 * <td>String</td>
 * <td>弹性IP的备注，缺省值为“”</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * 
 * @author pingqc
 *
 */
public class EIPSet {

	@JSONField(name = "EIPId")
	private String eipId;
	@JSONField(name = "Weight")
	private Integer weight;
	@JSONField(name = "BandwidthType")
	private Integer bandwidthType;
	@JSONField(name = "Bandwidth")
	private Integer bandwidth;
	@JSONField(name = "Status")
	private EIPStatus status;
	@JSONField(name = "ChargeType")
	private ChargeType chargeType;
	@JSONField(name = "CreateTime")
	private Integer createTime;
	@JSONField(name = "ExpireTime")
	private Integer expireTime;
	@JSONField(name = "Resource")
	private EIPResource resource;
	@JSONField(name = "EIPAddr")
	private List<EIPAddr> eipAddr;
	@JSONField(name = "Name")
	private String name;
	@JSONField(name = "Tag")
	private String tag;
	@JSONField(name = "Remark")
	private String remark;

	public String getEipId() {
		return eipId;
	}

	public void setEipId(String eipId) {
		this.eipId = eipId;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getBandwidthType() {
		return bandwidthType;
	}

	public void setBandwidthType(Integer bandwidthType) {
		this.bandwidthType = bandwidthType;
	}

	public Integer getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
	}

	public EIPStatus getStatus() {
		return status;
	}

	public void setStatus(EIPStatus status) {
		this.status = status;
	}

	public ChargeType getChargeType() {
		return chargeType;
	}

	public void setChargeType(ChargeType chargeType) {
		this.chargeType = chargeType;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
	}

	public EIPResource getResource() {
		return resource;
	}

	public void setResource(EIPResource resource) {
		this.resource = resource;
	}

	public List<EIPAddr> getEipAddr() {
		return eipAddr;
	}

	public void setEipAddr(List<EIPAddr> eipAddr) {
		this.eipAddr = eipAddr;
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

}
