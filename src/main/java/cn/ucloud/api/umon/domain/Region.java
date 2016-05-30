package cn.ucloud.api.umon.domain;

/**
 * 数据中心
 * @author pingqc
 *
 */
public enum Region {

	/**
	 * 北京BGP-A
	 */
	CN_BGP_01("cn-north-01"),
	/**
	 * 北京BGP-B
	 */
	CN_BGP_02("cn-north-02"),
	/**
	 * 北京BGP-C
	 */
	CN_BGP_03("cn-north-03"),
	/**
	 * 华东双线
	 */
	CN_EAST_01("cn-east-01"),
	/**
	 * 华南双线
	 */
	CN_SOUTH_01("cn-south-01"),
	/**
	 * 亚太
	 */
	HK_01("hk-01"),
	/**
	 * 北美
	 */
	US_WEST_01("us-west-01")
	;
	private String value;
	
	Region(String value) {
		this.value = value;
	}
	
	public String value() {
		return value;
	}
	
}
