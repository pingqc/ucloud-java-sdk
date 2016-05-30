package cn.ucloud.api.unet.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 申请到的IPv4地址（双线拥有两个IP地址）
 * 
 * <table class="docutils" border="1">
 * <colgroup> <col width="25%"> <col width="13%"> <col width="63%"> </colgroup>
 * <thead valign="bottom">
 * <tr class="row-odd">
 * <th class="head">Parameter Name</th>
 * <th class="head">Type</th>
 * <th class="head">Description</th>
 * </tr>
 * </thead> <tbody valign="top">
 * <tr class="row-even">
 * <td>EIPId</td>
 * <td>String</td>
 * <td>申请到的EIP资源ID</td>
 * </tr>
 * <tr class="row-odd">
 * <td>EIPAddr</td>
 * <td>Array</td>
 * <td>申请到的IPv4地址（双线拥有两个IP地址）</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 *
 */
public class EIPAddr {

	@JSONField(name = "OperatorName")
	private IPType operatorName;

	@JSONField(name = "IP")
	private String ip;

	public IPType getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(IPType operatorName) {
		this.operatorName = operatorName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}
