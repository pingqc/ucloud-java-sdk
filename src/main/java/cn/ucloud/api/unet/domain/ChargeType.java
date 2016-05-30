package cn.ucloud.api.unet.domain;

/**
 * 计费模式，枚举值为： 
 * Year，按年付费； 
 * Month，按月付费； 
 * Dynamic，按需付费(需开启权限)； 
 * Trial，试用(需开启权限) 默认为按月付费
 * @author pingqc
 *
 */
public enum ChargeType {

	Year,
	Month,
	Dynamic,
	Trial
	
}
