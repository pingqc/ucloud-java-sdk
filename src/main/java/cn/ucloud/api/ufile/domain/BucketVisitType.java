package cn.ucloud.api.ufile.domain;

/**
 * Bucket访问类型
 * @author pingqc
 *
 */
public enum BucketVisitType {

	PRIVATE("private"),
	PUBLIC("public");
	
	private String value;
	
	public String value() {
		return value;
	}
	
	BucketVisitType(String value) {
		this.value = value;
	}
		
}
