package cn.ucloud.api;

import java.util.Map;

import cn.ucloud.api.exception.InvalidRequestException;

public interface UCloudRequest<T extends UCloudResponse> {

	/**
	 * 获取action
	 * @return
	 */
	public String getAction();
	
	/**
	 * 客户端对请求数据进行校验，减轻服务器压力
	 */
	public void check() throws InvalidRequestException ;
	
	public Map<String, Object> getTextParams();
	
	public Class<T> getResponseClass();
	
}
