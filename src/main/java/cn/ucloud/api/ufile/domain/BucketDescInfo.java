package cn.ucloud.api.ufile.domain;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <table class="docutils" border="1">
 * <colgroup> <col width="19%"> <col width="11%"> <col width="70%"> </colgroup>
 * <thead valign="bottom">
 * <tr class="row-odd">
 * <th class="head">Name</th>
 * <th class="head">Type</th>
 * <th class="head">Description</th>
 * </tr>
 * </thead> <tbody valign="top">
 * <tr class="row-even">
 * <td>BucketName</td>
 * <td>String</td>
 * <td>Bucket名称</td>
 * </tr>
 * <tr class="row-odd">
 * <td>BucketId</td>
 * <td>String</td>
 * <td>Bucket的Id</td>
 * </tr>
 * <tr class="row-even">
 * <td>Domain</td>
 * <td>Map</td>
 * <td>Bucket的域名集合</td>
 * </tr>
 * <tr class="row-odd">
 * <td>CdnDomainId</td>
 * <td>Array</td>
 * <td>与Bucket关联的CND加速域名的ID列表</td>
 * </tr>
 * <tr class="row-even">
 * <td>Type</td>
 * <td>String</td>
 * <td>Bucket访问类型</td>
 * </tr>
 * <tr class="row-odd">
 * <td>CreateTime</td>
 * <td>Integer</td>
 * <td>Bucket的创建时间</td>
 * </tr>
 * <tr class="row-even">
 * <td>ModifyTime</td>
 * <td>Integer</td>
 * <td>Bucket的修改时间</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 *
 */
public class BucketDescInfo {

	@JSONField(name = "BucketName")
	private String bucketName;
	@JSONField(name = "BucketId")
	private String bucketId;
	@JSONField(name = "Domain")
	private DomainItem domain;
	@JSONField(name = "CdnDomainId")
	private List<String> cdnDomainId;
	@JSONField(name = "Type")
	private String type;
	@JSONField(name = "CreateTime")
	private Integer createTime;
	@JSONField(name = "ModifyTime")
	private Integer modifyTime;

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketId() {
		return bucketId;
	}

	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}

	public List<String> getCdnDomainId() {
		return cdnDomainId;
	}

	public DomainItem getDomain() {
		return domain;
	}

	public void setDomain(DomainItem domain) {
		this.domain = domain;
	}

	public void setCdnDomainId(List<String> cdnDomainId) {
		this.cdnDomainId = cdnDomainId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public Integer getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Integer modifyTime) {
		this.modifyTime = modifyTime;
	}

}
