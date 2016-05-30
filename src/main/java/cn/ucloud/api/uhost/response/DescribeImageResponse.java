package cn.ucloud.api.uhost.response;

import java.util.List;

import cn.ucloud.api.UCloudResponse;
import cn.ucloud.api.uhost.domain.ImageInfo;
import cn.ucloud.api.uhost.domain.PriceInfo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取指定数据中心镜像列表，用户可通过指定操作系统类型，镜像Id进行过滤。
 * 
 * @author pingqc
 *
 */
public class DescribeImageResponse extends UCloudResponse {

	@JSONField(name = "TotalCount")
	private Integer totalCount;
	@JSONField(name = "ImageSet")
	private List<ImageInfo> imageSet;

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ImageInfo> getImageSet() {
		return imageSet;
	}

	public void setImageSet(List<ImageInfo> imageSet) {
		this.imageSet = imageSet;
	}

}
