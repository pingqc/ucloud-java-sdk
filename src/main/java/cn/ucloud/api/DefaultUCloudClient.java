package cn.ucloud.api;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import cn.ucloud.api.exception.ApiException;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.util.StringUtils;
import cn.ucloud.api.util.UCloudUtil;

import com.alibaba.fastjson.JSON;

/**
 * 默认客户端
 * @author pingqc
 *
 */
public class DefaultUCloudClient implements UCloudClient {

	private String serverUrl;
	private String publicKey;
	private String privateKey;
	
	public DefaultUCloudClient(String serverUrl, String publicKey, String privateKey) {
		this.serverUrl = serverUrl;
		this.publicKey = publicKey;
		this.privateKey = privateKey;
	}
	
	@Override
	public <T extends UCloudResponse> T execute(UCloudRequest<T> request)
			throws ApiException, InvalidRequestException {
		//参数校验
		request.check();
		if(StringUtils.isEmpty(publicKey)) {
			throw new InvalidRequestException("public key may not be empty");
		}
		if(StringUtils.isEmpty(privateKey)) {
			throw new InvalidRequestException("private key may not be empty");
		}
		
		
		//签名
		String sign = UCloudUtil.signRequest(request.getTextParams(), publicKey, privateKey);
		//组装请求地址
		String reqUrl = UCloudUtil.buildRequestUrl(serverUrl, request.getTextParams(), publicKey, sign);
		System.out.println(reqUrl);
		try {
			String resp = doExexute(reqUrl);
			System.out.println(resp);
			T t = JSON.parseObject(resp, request.getResponseClass());
			
			return t;
			
		} catch (Exception e) {
			throw new ApiException(e);
		}
		
	}
	
	private String doExexute(String requestUrl) {
		try {
			URL url = new URL(requestUrl);
			InputStream is = url.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));   
			String line = null;
			StringBuilder resp = new StringBuilder();
			while((line = reader.readLine()) != null) {
				resp.append(line);
			}
			is.close();
			reader.close();
			return resp.toString();
		} catch (Exception e) {
			return "{\"RetCode\":\"-999\",\"Message\":\"" + e.getMessage() + "\"}";
		}
	}
	
}
