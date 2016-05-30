package cn.ucloud.api.unet.domain;

/**
 * 
 * 规则优先级
 * @author pingqc
 *
 */
public enum SecurityRulePriority {

	HIGH(50),
	MIDDLE(100),
	LOW(150);
	
	Integer value;
	
	public Integer value() {
		return value;
	}
	
	private SecurityRulePriority(Integer value) {
		this.value = value;
	}
}
