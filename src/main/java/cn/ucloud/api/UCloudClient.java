package cn.ucloud.api;

import cn.ucloud.api.exception.ApiException;
import cn.ucloud.api.exception.InvalidRequestException;

public interface UCloudClient {

	/**
	 * 
	 * @param request 请求参数的封装
	 * @return
	 * @throws ApiException	API调用异常
	 * @throws InvalidRequestException	请求参数不合法抛出的异常
	 */
	public <T extends UCloudResponse> T execute(UCloudRequest<T> request) throws ApiException, InvalidRequestException;
	
}
