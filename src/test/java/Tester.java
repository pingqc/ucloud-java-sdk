import java.util.ArrayList;
import java.util.List;

import cn.ucloud.api.DefaultUCloudClient;
import cn.ucloud.api.UCloudClient;
import cn.ucloud.api.exception.ApiException;
import cn.ucloud.api.exception.InvalidRequestException;
import cn.ucloud.api.ufile.domain.BucketVisitType;
import cn.ucloud.api.ufile.request.CreateBucketRequest;
import cn.ucloud.api.ufile.request.DeleteBucketRequest;
import cn.ucloud.api.ufile.request.DescribeBucketRequest;
import cn.ucloud.api.ufile.request.UpdateBucketRequest;
import cn.ucloud.api.ufile.response.CreateBucketResponse;
import cn.ucloud.api.ufile.response.DeleteBucketResponse;
import cn.ucloud.api.ufile.response.DescribeBucketResponse;
import cn.ucloud.api.ufile.response.UpdateBucketResponse;
import cn.ucloud.api.uhost.domain.LoginMode;
import cn.ucloud.api.uhost.request.AttachUDiskRequest;
import cn.ucloud.api.uhost.request.CreateCustomImageRequest;
import cn.ucloud.api.uhost.request.CreateUHostInstanceRequest;
import cn.ucloud.api.uhost.request.CreateUHostInstanceSnapshotRequest;
import cn.ucloud.api.uhost.request.DescribeImageRequest;
import cn.ucloud.api.uhost.request.DescribeUHostInstanceRequest;
import cn.ucloud.api.uhost.request.DescribeUHostInstanceSnapshotRequest;
import cn.ucloud.api.uhost.request.DetachUDiskRequest;
import cn.ucloud.api.uhost.request.GetUHostInstancePriceRequest;
import cn.ucloud.api.uhost.request.GetUHostInstanceVncInfoRequest;
import cn.ucloud.api.uhost.request.ModifyUHostInstanceNameRequest;
import cn.ucloud.api.uhost.request.ModifyUHostInstanceRemarkRequest;
import cn.ucloud.api.uhost.request.ModifyUHostInstanceTagRequest;
import cn.ucloud.api.uhost.request.RebootUHostInstanceRequest;
import cn.ucloud.api.uhost.request.ReinstallUHostInstanceRequest;
import cn.ucloud.api.uhost.request.ResetUHostInstancePasswordRequest;
import cn.ucloud.api.uhost.request.ResizeUHostInstanceRequest;
import cn.ucloud.api.uhost.request.StartUHostInstanceRequest;
import cn.ucloud.api.uhost.request.StopUHostInstanceRequest;
import cn.ucloud.api.uhost.request.TerminateCustomImageRequest;
import cn.ucloud.api.uhost.request.TerminateUHostInstanceRequest;
import cn.ucloud.api.uhost.response.AttachUDiskResponse;
import cn.ucloud.api.uhost.response.CreateCustomImageResponse;
import cn.ucloud.api.uhost.response.CreateUHostInstanceResponse;
import cn.ucloud.api.uhost.response.CreateUHostInstanceSnapshotResponse;
import cn.ucloud.api.uhost.response.DescribeImageResponse;
import cn.ucloud.api.uhost.response.DescribeUHostInstanceResponse;
import cn.ucloud.api.uhost.response.DescribeUHostInstanceSnapshotResponse;
import cn.ucloud.api.uhost.response.DetachUDiskResponse;
import cn.ucloud.api.uhost.response.GetUHostInstancePriceResponse;
import cn.ucloud.api.uhost.response.GetUHostInstanceVncInfoResponse;
import cn.ucloud.api.uhost.response.ModifyUHostInstanceNameResponse;
import cn.ucloud.api.uhost.response.ModifyUHostInstanceRemarkResponse;
import cn.ucloud.api.uhost.response.ModifyUHostInstanceTagResponse;
import cn.ucloud.api.uhost.response.RebootUHostInstanceResponse;
import cn.ucloud.api.uhost.response.ReinstallUHostInstanceResponse;
import cn.ucloud.api.uhost.response.ResetUHostInstancePasswordResponse;
import cn.ucloud.api.uhost.response.ResizeUHostInstanceResponse;
import cn.ucloud.api.uhost.response.StartUHostInstanceResponse;
import cn.ucloud.api.uhost.response.StopUHostInstanceResponse;
import cn.ucloud.api.uhost.response.TerminateCustomImageResponse;
import cn.ucloud.api.uhost.response.TerminateUHostInstanceResponse;
import cn.ucloud.api.umon.domain.Region;
import cn.ucloud.api.umon.domain.ResourceType;
import cn.ucloud.api.umon.request.GetMetricRequest;
import cn.ucloud.api.umon.response.GetMetricResponse;
import cn.ucloud.api.unet.domain.IPType;
import cn.ucloud.api.unet.domain.ProtocolType;
import cn.ucloud.api.unet.domain.SecurityAction;
import cn.ucloud.api.unet.domain.SecurityRule;
import cn.ucloud.api.unet.domain.SecurityRulePriority;
import cn.ucloud.api.unet.request.AllocateEIPRequest;
import cn.ucloud.api.unet.request.AllocateVIPRequest;
import cn.ucloud.api.unet.request.BindEIPRequest;
import cn.ucloud.api.unet.request.CreateSecurityGroupRequest;
import cn.ucloud.api.unet.request.DeleteSecurityGroupRequest;
import cn.ucloud.api.unet.request.DescribeEIPRequest;
import cn.ucloud.api.unet.request.DescribeSecurityGroupRequest;
import cn.ucloud.api.unet.request.DescribeSecurityGroupResourceRequest;
import cn.ucloud.api.unet.request.DescribeVIPRequest;
import cn.ucloud.api.unet.request.GetEIPPriceRequest;
import cn.ucloud.api.unet.request.GrantSecurityGroupRequest;
import cn.ucloud.api.unet.request.ModifyEIPBandwidthRequest;
import cn.ucloud.api.unet.request.ModifyEIPWeightRequest;
import cn.ucloud.api.unet.request.ReleaseEIPRequest;
import cn.ucloud.api.unet.request.ReleaseVIPRequest;
import cn.ucloud.api.unet.request.UnBindEIPRequest;
import cn.ucloud.api.unet.request.UpdateEIPAttributeRequest;
import cn.ucloud.api.unet.request.UpdateSecurityGroupRequest;
import cn.ucloud.api.unet.response.AllocateEIPResponse;
import cn.ucloud.api.unet.response.AllocateVIPResponse;
import cn.ucloud.api.unet.response.BindEIPResponse;
import cn.ucloud.api.unet.response.CreateSecurityGroupResponse;
import cn.ucloud.api.unet.response.DeleteSecurityGroupResponse;
import cn.ucloud.api.unet.response.DescribeEIPResponse;
import cn.ucloud.api.unet.response.DescribeSecurityGroupResourceResponse;
import cn.ucloud.api.unet.response.DescribeSecurityGroupResponse;
import cn.ucloud.api.unet.response.DescribeVIPResponse;
import cn.ucloud.api.unet.response.GetEIPPriceResponse;
import cn.ucloud.api.unet.response.GrantSecurityGroupResponse;
import cn.ucloud.api.unet.response.ModifyEIPBandwidthResponse;
import cn.ucloud.api.unet.response.ModifyEIPWeightResponse;
import cn.ucloud.api.unet.response.ReleaseEIPResponse;
import cn.ucloud.api.unet.response.ReleaseVIPResponse;
import cn.ucloud.api.unet.response.UnBindEIPResponse;
import cn.ucloud.api.unet.response.UpdateEIPAttributeResponse;
import cn.ucloud.api.unet.response.UpdateSecurityGroupResponse;

import com.alibaba.fastjson.JSON;

public class Tester {

	private static String serverUrl = "http://api.ucloud.cn";
	private static String publicKey = "ucloudcjlutest@126.com14287658810002015136547";
	private static String privateKey = "your private key";
	private static UCloudClient client = null;
	
	public static void main(String[] args) throws ApiException, InvalidRequestException {
		client = new DefaultUCloudClient(serverUrl, publicKey, privateKey);
		
			DescribeUHostInstanceRequest req = new DescribeUHostInstanceRequest();
			req.setRegion(Region.CN_BGP_03.value());
			DescribeUHostInstanceResponse resp = client.execute(req);
			System.out.println(JSON.toJSONString(resp, true));
		
	}

	private static void ReinstallUHostInstance() throws ApiException, InvalidRequestException {
		ReinstallUHostInstanceRequest req = new ReinstallUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setImageId("11f0dbdeca350a066cb1d0d760782f43");
		req.setUhostId("uhost-1z3sg3");
		req.setPassword("fff");
		ReinstallUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void CreateUHostInstance() throws ApiException, InvalidRequestException {
		CreateUHostInstanceRequest req = new CreateUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setImageId("11f0dbdeca350a066cb1d0d760782f43");
		req.setLoginMode(LoginMode.Password);
		req.setPassword("pwd");
		req.setCpu(1);
		req.setMemory(2048);
		req.setDiskSpace(10);
		req.setName("uhostName");
		CreateUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void DetachUDisk() throws ApiException, InvalidRequestException {
		DetachUDiskRequest req = new DetachUDiskRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		req.setUdiskId("hcD893788498418d4484baedd2bdb2a07943");
		DetachUDiskResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void AttachUDisk() throws ApiException, InvalidRequestException {
		AttachUDiskRequest req = new AttachUDiskRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		req.setUdiskId("hcD893788498418d4484baedd2bdb2a07943");
		AttachUDiskResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void DescribeUHostInstanceSnapshot() throws ApiException, InvalidRequestException {
		DescribeUHostInstanceSnapshotRequest req = new DescribeUHostInstanceSnapshotRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		DescribeUHostInstanceSnapshotResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void CreateUHostInstanceSnapshot() throws ApiException, InvalidRequestException {
		CreateUHostInstanceSnapshotRequest req = new CreateUHostInstanceSnapshotRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		CreateUHostInstanceSnapshotResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void TerminateCustomImage() throws ApiException, InvalidRequestException {
		TerminateCustomImageRequest req = new TerminateCustomImageRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setImageId("uimage-3eihip");
		TerminateCustomImageResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void CreateCustomImage() throws ApiException, InvalidRequestException {
		CreateCustomImageRequest req = new CreateCustomImageRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		req.setImageName("test_image");
		req.setImageDescription("desc");
		CreateCustomImageResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void GetUHostInstanceVncInfo() throws ApiException, InvalidRequestException {
		GetUHostInstanceVncInfoRequest req = new GetUHostInstanceVncInfoRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		GetUHostInstanceVncInfoResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void DescribeImage() throws ApiException, InvalidRequestException {
		DescribeImageRequest req = new DescribeImageRequest();
		req.setRegion(Region.CN_BGP_03.value());
		DescribeImageResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void GetUHostInstancePrice() throws ApiException, InvalidRequestException {
		GetUHostInstancePriceRequest req = new GetUHostInstancePriceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setCpu(1);
		req.setMemory(2048);
		req.setCount(1);
		req.setImageId("uimage-zkezxp");
		GetUHostInstancePriceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ModifyUHostInstanceRemark() throws ApiException, InvalidRequestException {
		ModifyUHostInstanceRemarkRequest req = new ModifyUHostInstanceRemarkRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		req.setRemark("fff");
		ModifyUHostInstanceRemarkResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ModifyUHostInstanceTag() throws ApiException, InvalidRequestException {
		ModifyUHostInstanceTagRequest req = new ModifyUHostInstanceTagRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		req.setTag("testtagg");
		ModifyUHostInstanceTagResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ModifyUHostInstanceName() throws ApiException, InvalidRequestException {
		ModifyUHostInstanceNameRequest req = new ModifyUHostInstanceNameRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		req.setName("testname");
		ModifyUHostInstanceNameResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ResetUHostInstancePassword() throws ApiException, InvalidRequestException {
		ResetUHostInstancePasswordRequest req = new ResetUHostInstancePasswordRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		req.setPassword("test");
		ResetUHostInstancePasswordResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void RebootUHostInstance() throws ApiException, InvalidRequestException {
		RebootUHostInstanceRequest req = new RebootUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		RebootUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void StopUHostInstance() throws ApiException, InvalidRequestException {
		StopUHostInstanceRequest req = new StopUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		StopUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void StartUHostInstance() throws ApiException, InvalidRequestException {
		StartUHostInstanceRequest req = new StartUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		StartUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ResizeUHostInstance() throws ApiException, InvalidRequestException {
		ResizeUHostInstanceRequest req = new ResizeUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg3");
		req.setMemory(2048);
		ResizeUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void TerminateUHostInstance() throws ApiException, InvalidRequestException {
		TerminateUHostInstanceRequest req = new TerminateUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setUhostId("uhost-1z3sg2");
		TerminateUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}

	private static void DescribeUHostInstance() throws ApiException, InvalidRequestException {
		DescribeUHostInstanceRequest req = new DescribeUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		DescribeUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void DeleteSecurityGroup() throws ApiException, InvalidRequestException {
		DeleteSecurityGroupRequest req = new DeleteSecurityGroupRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setGroupId("17060");
		DeleteSecurityGroupResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void GrantSecurityGroup() throws ApiException, InvalidRequestException {
		GrantSecurityGroupRequest req = new GrantSecurityGroupRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setGroupId("15757");
		req.setResourceType(ResourceType.uhost);
		req.setResourceId("uhost-1z3sg3");
		GrantSecurityGroupResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void UpdateSecurityGroup() throws ApiException, InvalidRequestException {
		UpdateSecurityGroupRequest req = new UpdateSecurityGroupRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setGroupId("17060");
		List<SecurityRule> rules = new ArrayList<SecurityRule>();
		SecurityRule r = null;
		r = new SecurityRule();
		r.setAction(SecurityAction.DROP);
		r.setProto(ProtocolType.UDP);
		r.setDstPort("1000-3000");
		r.setSrcIp("0.0.0.0");
		r.setPriority(SecurityRulePriority.HIGH.value());
		rules.add(r);
		req.setRules(rules);
		UpdateSecurityGroupResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void DescribeSecurityGroupResource() throws ApiException, InvalidRequestException {
		DescribeSecurityGroupResourceRequest req = new DescribeSecurityGroupResourceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setGroupId("17060");//15757, 15756
		DescribeSecurityGroupResourceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void DescribeSecurityGroup() throws ApiException, InvalidRequestException {
		DescribeSecurityGroupRequest req = new DescribeSecurityGroupRequest();
		req.setRegion(Region.CN_BGP_03.value());
		DescribeSecurityGroupResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void CreateSecurityGroup() throws ApiException, InvalidRequestException {
		CreateSecurityGroupRequest req = new CreateSecurityGroupRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setGroupName("test_firewall");
		req.setDescription("fasdfsa");
		List<SecurityRule> rules = new ArrayList<SecurityRule>();
		SecurityRule r = null;
		r = new SecurityRule();
		r.setAction(SecurityAction.ACCEPT);
		r.setProto(ProtocolType.TCP);
		r.setDstPort("1000-2000");
		r.setSrcIp("0.0.0.0");
		r.setPriority(SecurityRulePriority.HIGH.value());
		rules.add(r);
		req.setRules(rules);
		CreateSecurityGroupResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ReleaseVIP() throws ApiException, InvalidRequestException {
		ReleaseVIPRequest req = new ReleaseVIPRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setVip("10.10.69.160");
		ReleaseVIPResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void DescribeVIP() throws ApiException, InvalidRequestException {
		DescribeVIPRequest req = new DescribeVIPRequest();
		req.setRegion(Region.CN_BGP_03.value());
		DescribeVIPResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void AllocateVIP() throws ApiException, InvalidRequestException {
		AllocateVIPRequest req = new AllocateVIPRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setCount(1);
		AllocateVIPResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void GetEIPPrice() throws ApiException, InvalidRequestException {
		GetEIPPriceRequest req = new GetEIPPriceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setOperatorName(IPType.Bgp);
		req.setBandwidth(4);
		GetEIPPriceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ModifyEIPWeight() throws ApiException, InvalidRequestException {
		ModifyEIPWeightRequest req = new ModifyEIPWeightRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setEipId("eip-n5s1uy");
		req.setWeight(49);
		ModifyEIPWeightResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ModifyEIPBandwidth() throws ApiException, InvalidRequestException {
		ModifyEIPBandwidthRequest req = new ModifyEIPBandwidthRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setEipId("eip-n5s1uy");
		req.setBandwidth(1);
		ModifyEIPBandwidthResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void UnBindEIP() throws ApiException, InvalidRequestException {
		UnBindEIPRequest req = new UnBindEIPRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setEipId("eip-n5s1uy");
		req.setResourceType(ResourceType.uhost);
		req.setResourceId("uhost-1z3sg3");
		UnBindEIPResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void BindEIP() throws ApiException, InvalidRequestException {
		BindEIPRequest req = new BindEIPRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setEipId("eip-n5s1uy");
		req.setResourceType(ResourceType.uhost);
		req.setResourceId("uhost-1z3sg3");
		BindEIPResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void ReleaseEIP() throws ApiException, InvalidRequestException {
		ReleaseEIPRequest req = new ReleaseEIPRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setEipId("eip-kpfsca");
		ReleaseEIPResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void UpdateEIPAttribute() throws ApiException, InvalidRequestException {
		UpdateEIPAttributeRequest req = new UpdateEIPAttributeRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setEipId("eip-kpfsca");
		req.setRemark("remark");
		UpdateEIPAttributeResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void DescribeEIP() throws ApiException, InvalidRequestException {
		DescribeEIPRequest req = new DescribeEIPRequest();
		req.setRegion(Region.CN_BGP_03.value());
		
		DescribeEIPResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void AllocateEIP() throws ApiException, InvalidRequestException {
		AllocateEIPRequest req = new AllocateEIPRequest();
		req.setRegion(Region.CN_BGP_03.value());
		req.setOperatorName(IPType.Bgp);
		req.setBandwidth(1);
		AllocateEIPResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void deleteBucket() throws ApiException, InvalidRequestException {
		DeleteBucketRequest req = new DeleteBucketRequest();
		req.setBucketName("cjlu2222");
		DeleteBucketResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void updateBucket() throws ApiException, InvalidRequestException {
		UpdateBucketRequest req = new UpdateBucketRequest();
		req.setBucketName("cjlu2222");
		req.setType(BucketVisitType.PUBLIC.value());
		UpdateBucketResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	private static void describeBucket() throws ApiException, InvalidRequestException {
		DescribeBucketRequest req = new DescribeBucketRequest();
		DescribeBucketResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
	}
	
	private static void createBucket() throws ApiException, InvalidRequestException {
		
		CreateBucketRequest req = new CreateBucketRequest();
		req.setBucketName("cjlu2222");
		
		CreateBucketResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp));
		
	}
	
	private static void getMetric() throws ApiException {
		GetMetricRequest req = new GetMetricRequest();
		String[] metrics = new String[] { "NetworkIn", "NetworkOut" };
		req.setRegion("cn-north-03");
		req.setMetricNames(metrics);
		req.setResourceType("uhost");
		req.setResourceId("uhost-1z3sg3");

		GetMetricResponse response;
		try {
			response = client.execute(req);
			System.out.println(JSON.toJSONString(response, true));
		} catch (InvalidRequestException e) {
			e.printStackTrace();
		}
	}

}
