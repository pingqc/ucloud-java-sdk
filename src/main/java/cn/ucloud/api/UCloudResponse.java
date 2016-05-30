package cn.ucloud.api;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

public abstract class UCloudResponse implements Serializable {

	private static final long serialVersionUID = 3214751786060895547L;

	@JSONField(name = "Action")
	private String action;

	@JSONField(name = "RetCode")
	private String retCode;

	@JSONField(name = "Message")
	private String message;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
