package cn.ucloud.api.uhost.request;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import cn.ucloud.api.UCloudRequest;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.uhost.response.ResizeUHostInstanceResponse;

/**
 * <pre>
 * 修改指定UHost实例的资源配置，如CPU核心数，内存容量大小，磁盘空间大小等。
 * 
 * 修改配置注意事项： 
 * 1.修改配置前，请确认该实例已经被关闭。 
 * 2.修改磁盘空间大小后，请在启动后按照说明，进入操作系统进行操作。
 * </pre>
 * 
 * <table class="docutils" border="1">
 * <colgroup> <col width="9%"> <col width="5%"> <col width="79%"> <col
 * width="6%"> </colgroup> <thead valign="bottom">
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
 * <td>UHostId</td>
 * <td>String</td>
 * <td>UHost实例ID</td>
 * <td>Yes</td>
 * </tr>
 * <tr class="row-even">
 * <td>CPU</td>
 * <td>Integer</td>
 * <td>虚拟CPU核数，单位：个，范围：[1,16]，最小值为1，其他值是2的倍数，默认值为当前实例的CPU核数</td>
 * <td>no</td>
 * </tr>
 * <tr class="row-odd">
 * <td>Memory</td>
 * <td>Integer</td>
 * <td>内存大小，单位：MB，范围[2048,65536]，步长：2048，默认值为当前实例的内存大小</td>
 * <td>no</td>
 * </tr>
 * <tr class="row-even">
 * <td>DiskSpace</td>
 * <td>Integer</td>
 * <td>数据盘大小，单位：GB，范围[10,1000]，步长：10，默认值为当前实例的数据盘大小，数据盘不支持缩容，因此不允许输入比当前实例数据盘大小的值
 * </td>
 * <td>no</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 */
public class ResizeUHostInstanceRequest implements
		UCloudRequest<ResizeUHostInstanceResponse> {

	private static final String ACTION = "ResizeUHostInstance";

	@NotNull
	private String region;
	@NotNull
	private String uhostId;
	@Min(1)
	@Max(16)
	private Integer cpu;
	@Min(2048)
	@Max(65536)
	private Integer memory;
	@Min(10)
	@Max(100)
	private Integer diskSpace;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getUhostId() {
		return uhostId;
	}

	public void setUhostId(String uhostId) {
		this.uhostId = uhostId;
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
		map.put("UHostId", uhostId);
		map.put("CPU", cpu);
		map.put("Memory", memory);
		map.put("DiskSpace", diskSpace);
		return map;
	}

	@Override
	public Class<ResizeUHostInstanceResponse> getResponseClass() {
		return ResizeUHostInstanceResponse.class;
	}

}
