package cn.ucloud.api.unet.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 防火墙规则
 * <table class="docutils" border="1">
 * <colgroup> <col width="16%"> <col width="9%"> <col width="75%"> </colgroup>
 * <thead valign="bottom">
 * <tr class="row-odd">
 * <th class="head">Parameter name</th>
 * <th class="head">Type</th>
 * <th class="head">Description</th>
 * </tr>
 * </thead> <tbody valign="top">
 * <tr class="row-even">
 * <td>Proto</td>
 * <td>String</td>
 * <td>网络协议，枚举值为： TCP，UDP，ICMP，GRE</td>
 * </tr>
 * <tr class="row-odd">
 * <td>Dst_port</td>
 * <td>String</td>
 * <td>目标端口，范围：[1-65535]，可指定单个端口（如80），或指定端口段（1-1024）</td>
 * </tr>
 * <tr class="row-even">
 * <td>Src_ip</td>
 * <td>String</td>
 * <td>源地址，格式为’x.x.x.x/x 或 x.x.x.x’的有效IP地址。</td>
 * </tr>
 * <tr class="row-odd">
 * <td>Action</td>
 * <td>String</td>
 * <td>防火墙动作，枚举值为： ACCEPT：允许通过防火墙； DROP：禁止通过防火墙并不给任何返回信息</td>
 * </tr>
 * <tr class="row-even">
 * <td>Priority</td>
 * <td>Integer</td>
 * <td>规则优先级，枚举值为：50（高），100（中），150（低）</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 *
 */
public class SecurityRule {

	@JSONField(name = "ProtocolType")
	private ProtocolType proto;
	@JSONField(name = "DstPort")
	private String dstPort;
	@JSONField(name = "SrcIP")
	private String srcIp;
	@JSONField(name = "RuleAction")
	private SecurityAction action;
	@JSONField(name = "Priority")
	private Integer priority;

	public ProtocolType getProto() {
		return proto;
	}

	public void setProto(ProtocolType proto) {
		this.proto = proto;
	}

	public String getDstPort() {
		return dstPort;
	}

	public void setDstPort(String dstPort) {
		this.dstPort = dstPort;
	}

	public String getSrcIp() {
		return srcIp;
	}

	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}

	public SecurityAction getAction() {
		return action;
	}

	public void setAction(SecurityAction action) {
		this.action = action;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

}
