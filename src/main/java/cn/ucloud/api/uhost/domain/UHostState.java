package cn.ucloud.api.uhost.domain;

/**
 * UHost实例状态
 * 
 * @author pingqc
 *
 */
public enum UHostState {

	/**
	 * 初始化
	 */
	Initializing,
	/**
	 * 启动中
	 */
	Starting,
	/**
	 * 运行中
	 */
	Running,
	/**
	 * 关机中
	 */
	Stopping,
	/**
	 * 关机
	 */
	Stopped;

}
