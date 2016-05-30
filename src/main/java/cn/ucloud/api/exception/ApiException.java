package cn.ucloud.api.exception;

public class ApiException extends Exception {

	private String retCode;
	private String message;
	
	public ApiException() {
		super();
	}

	public ApiException(Throwable e) {
		super(e);
	}
	
	public ApiException(String retCode, String message) {
		super(retCode + ":" + message);
		this.retCode = retCode;
		this.message = message;
	}
	
}
