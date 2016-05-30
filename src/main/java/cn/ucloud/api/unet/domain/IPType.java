package cn.ucloud.api.unet.domain;

/**
 * IP类型（线路）
 * @author pingqc
 *
 */
public enum IPType {

	/**
	 * 电信
	 */
	Telecom,
	/**
	 * 联通
	 */
	Unicom, 
	/**
	 * 国际
	 */
	International,
	/**
	 * BGP
	 */
	Bgp, 
	/**
	 * 内网
	 */
	Private,
	/**
	 * 双线
	 */
	Duplet;

}
