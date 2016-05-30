package cn.ucloud.api.exception;

/**
 * 请求参数异常
 * @author pingqc
 *
 */
public class InvalidRequestException extends Exception {

	public InvalidRequestException() {
	}
	
	public InvalidRequestException(String message) {
		super(message);
	}
	
	public InvalidRequestException(Throwable e) {
		super(e);
	}
	
	public InvalidRequestException(String message, Throwable e) {
		super(message, e);
	}
	
}
