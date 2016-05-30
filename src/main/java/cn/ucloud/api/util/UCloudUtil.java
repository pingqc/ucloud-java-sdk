package cn.ucloud.api.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;

public class UCloudUtil {

	/**
	 * 请求参数签名
	 * @param paramsMap
	 * @param privateKey
	 * @return
	 */
	public static String signRequest(Map<String, Object> params, String publicKey, String privateKey) {

		params.put("PublicKey", publicKey);
		String[] keys = params.keySet().toArray(new String[0]);
		Arrays.sort(keys);

		StringBuilder query = new StringBuilder();
		for (String key : keys) {
			Object obj = params.get(key);
			String value = (obj == null)? "": obj.toString();
			if (StringUtils.areNotEmpty(key, value)) {
				query.append(key).append(value);
			}
		}
		query.append(privateKey);
		
		return SHA1(query.toString());
		
	}
	
	/**
	 * 构建请求地址
	 * @param serverUrl
	 * @param params
	 * @param sign
	 * @param sign 
	 * @return
	 */
	public static String buildRequestUrl(String serverUrl, Map<String, Object> params, String publicKey, String sign) {

		StringBuilder paramsStr = new StringBuilder(serverUrl);
		paramsStr.append("/?");// ?&最后会被替换成?		
		Set<String> keySet = params.keySet();
		for(String key: keySet) {
			Object obj = params.get(key);
			String value = (obj == null)? "": obj.toString();
			if (StringUtils.areNotEmpty(key, value)) {
				paramsStr.append("&").append(key).append("=").append(value);
			}
		}
		paramsStr.append("&Signature=").append(sign)
				 .append("&PublicKey=").append(publicKey);
		
		return paramsStr.toString().replaceFirst("\\?&", "\\?");		
	}
	
	/**
	 * @param decript
	 * @return
	 */
    private static String SHA1(String decript) {
        try {
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
            digest.update(decript.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
 
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
	
}
