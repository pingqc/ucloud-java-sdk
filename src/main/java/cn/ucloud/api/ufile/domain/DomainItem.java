package cn.ucloud.api.ufile.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
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
 * <td>Src</td>
 * <td>Array</td>
 * <td>源站域名</td>
 * </tr>
 * <tr class="row-odd">
 * <td>Cdn</td>
 * <td>Array</td>
 * <td>UCDN加速域名</td>
 * </tr>
 * <tr class="row-even">
 * <td>CustomSrc</td>
 * <td>Array</td>
 * <td>用户自定义源站域名</td>
 * </tr>
 * <tr class="row-odd">
 * <td>CustomCdn</td>
 * <td>Array</td>
 * <td>用户自定义CDN加速域名</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author pingqc
 *
 */
public class DomainItem {

	@JSONField(name = "Src")
	private List<String> src;
	@JSONField(name = "Cdn")
	private List<String> Cdn;
	@JSONField(name = "CustomSrc")
	private List<String> customSrc;
	@JSONField(name = "CustomCdn")
	private List<String> customCdn;

	public List<String> getSrc() {
		return src;
	}

	public void setSrc(List<String> src) {
		this.src = src;
	}

	public List<String> getCdn() {
		return Cdn;
	}

	public void setCdn(List<String> cdn) {
		Cdn = cdn;
	}

	public List<String> getCustomSrc() {
		return customSrc;
	}

	public void setCustomSrc(List<String> customSrc) {
		this.customSrc = customSrc;
	}

	public List<String> getCustomCdn() {
		return customCdn;
	}

	public void setCustomCdn(List<String> customCdn) {
		this.customCdn = customCdn;
	}

}
