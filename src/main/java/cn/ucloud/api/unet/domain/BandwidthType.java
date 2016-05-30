package cn.ucloud.api.unet.domain;

/**
 * 带宽模式
 * 
 * @author pingqc
 *
 */
public enum BandwidthType {

	/**
	 * 共享模式
	 */
	SHARE_MODE(1),
	/**
	 * 非共享模式
	 */
	NO_SHARE_MODE(0);

	Integer value;

	BandwidthType(Integer value) {
		this.value = value;
	}

}
