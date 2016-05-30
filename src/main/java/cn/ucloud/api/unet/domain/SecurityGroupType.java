package cn.ucloud.api.unet.domain;

/**
 * 防火墙组类型
 * @author pingqc
 *
 */
public class SecurityGroupType {

	/**
	 * 用户自定义防火墙
	 */
	public static final int CUSTOM_FIREWALL = 0;
	/**
	 * 默认Web防火墙
	 */
	public static final int DEFAULT_WEB_FIREWALL = 1;
	/**
	 * 默认非Web防火墙
	 */
	public static final int DEFAULT_NOT_WEB_FIREWALL = 2;
	
}
