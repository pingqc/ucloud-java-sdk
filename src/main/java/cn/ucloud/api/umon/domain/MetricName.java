package cn.ucloud.api.umon.domain;

public class MetricName {

	/*
	 * 云主机
	 */
	public enum UHost {
		NetworkIn, 
		NetworkOut, 
		CPUUtilization, 
		IORead, 
		IOWrite, 
		DiskReadOps,
		NICIn, 
		NICOut, 
		MemUsage, 
		DataSpaceUsage, 
		RootSpaceUsage, 
		ReadonlyDiskCount, 
		RunnableProcessCount, 
		BlockProcessCount
	}

	/*
	 * 云数据库
	 */
	public enum UDB {
		CPUUtilization,
		MemUsage,
		QPS,
		ExpensiveQuery
	}
	
	/*
	 * 负载均衡
	 */
	public enum ULB {
		NetworkOut,
		TotalNetworkOut,
		CurrentConnections
	}
	
	/*
	 * 云内存存储
	 */
	public enum UMem {
		Usage,
		QPS,
		InstanceCount
	}
}
