package cn.ucloud.api.unet.domain;

/**
 * 弹性IP的资源绑定状态，
 * 枚举值为： 
 * 	used：已绑定，
 * 	free：未绑定，
 * 	freeze：已冻结
 * @author pingqc
 *
 */
public enum EIPStatus {

	used,
	free,
	freeze
	
}
