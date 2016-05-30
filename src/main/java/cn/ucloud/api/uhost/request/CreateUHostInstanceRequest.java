package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.domain.LoginMode;
import cn.ucloud.api.uhost.response.CreateUHostInstanceResponse;
import cn.ucloud.api.unet.domain.ChargeType;
import cn.ucloud.api.util.StringUtils;

/**
 * 从指定UHost实例，生成自定义镜像。<br/>
 * <table class="docutils" border="1">
 * <colgroup> <col width="16%"> <col width="8%"> <col width="66%"> <col
 * width="9%"> </colgroup> <thead valign="bottom">
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
 * <td>数据中心, 参见 <a class="reference external"
 * href="../regionlist.html">数据中心列表</a></td>
 * <td>Yes</td>
 * </tr>
 * <tr class="row-odd">
 * <td>ImageId</td>
 * <td>String</td>
 * <td>镜像Id, 参见 <a class="reference external"
 * href="./describe_image.html">DescribeImage</a></td>
 * <td>Yes</td>
 * </tr>
 * <tr class="row-even">
 * <td>LoginMode</td>
 * <td>String</td>
 * <td>认证方式。密码: Password，key: KeyPair（暂不支持）</td>
 * <td>Yes</td>
 * </tr>
 * <tr class="row-odd">
 * <td>Password</td>
 * <td>String</td>
 * <td>UHost密码，LoginMode为Password时此项必须（密码需使用base64进行编码）</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-even">
 * <td>KeyPair</td>
 * <td>String</td>
 * <td>Keyname，LoginMode为KeyPair时此项必须（暂不支持）</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-odd">
 * <td>CPU</td>
 * <td>Integer</td>
 * <td>虚拟CPU核数， 单位：个，范围：[1,16], 最小值为1，其他值是2的倍数， 默认值: 4</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-even">
 * <td>Memory</td>
 * <td>Integer</td>
 * <td>内存大小 , 单位：MB 范围[2048,65536]， 步长：2048， 默认值：8192</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-odd">
 * <td>DiskSpace</td>
 * <td>Integer</td>
 * <td>数据盘大小， 单位：GB， 范围[0,1000]， 步长：10， 默认值：60</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-even">
 * <td>Name</td>
 * <td>String</td>
 * <td>UHost实例名称， 默认：UHost</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-odd">
 * <td>NetworkId</td>
 * <td>String</td>
 * <td>网络Id， 默认：基础网络</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-even">
 * <td>SecurityGroupId</td>
 * <td>String</td>
 * <td>防火墙Id， 默认：Web防火墙</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-odd">
 * <td>ChargeType</td>
 * <td>String</td>
 * <td>计费模式，枚举值为： Year，按年付费； Month，按月付费； Dynamic，按需付费（需开启权限）； Trial，试用（需开启权限）
 * 默认为月付</td>
 * <td>No</td>
 * </tr>
 * <tr class="row-even">
 * <td>Quantity</td>
 * <td>Integer</td>
 * <td>购买时长，默认: 1</td>
 * <td>No</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 */
public class CreateUHostInstanceRequest implements
		UCloudRequest<CreateUHostInstanceResponse> {

	private static final String ACTION = "CreateUHostInstance";

	@NotNull
	private String region;
	@NotNull
	private String imageId;
	@NotNull
	private LoginMode loginMode;
	private String password;
	private String keyPair;
	@Range(min = 1, max = 16)
	private Integer cpu;
	@Range(min = 2048, max = 65536)
	private Integer memory;
	@Range(min = 0, max = 1000)
	private Integer diskSpace;
	private String name;
	private String networkId;
	private String securityGroupId;
	private ChargeType chargeType;
	private Integer quantity;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public LoginMode getLoginMode() {
		return loginMode;
	}

	public void setLoginMode(LoginMode loginMode) {
		this.loginMode = loginMode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getKeyPair() {
		return keyPair;
	}

	public void setKeyPair(String keyPair) {
		this.keyPair = keyPair;
	}

	public Integer getCpu() {
		return cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public Integer getDiskSpace() {
		return diskSpace;
	}

	public void setDiskSpace(Integer diskSpace) {
		this.diskSpace = diskSpace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNetworkId() {
		return networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	public String getSecurityGroupId() {
		return securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
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
		map.put("ImageId", imageId);
		map.put("LoginMode", loginMode);
		map.put("Password", StringUtils.encodeBase64(password));
		map.put("KeyPair", keyPair);
		map.put("CPU", cpu);
		map.put("Memory", memory);
		map.put("DiskSpace", diskSpace);
		map.put("Name", name);
		map.put("NetworkId", networkId);
		map.put("SecurityGroupId", securityGroupId);
		map.put("ChargeType", chargeType);
		map.put("Quantity", quantity);
		return map;
	}

	@Override
	public Class<CreateUHostInstanceResponse> getResponseClass() {
		return CreateUHostInstanceResponse.class;
	}

}
