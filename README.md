# ucloud-java-sdk

### 介绍

UCloud-Java-SDK是UCloud官方API的Java版SDK。借鉴了[TAOBAO API](http://open.taobao.com/api/api_list.htm?spm=a219a.7386653.1998342671.4.Vb7FQs)优秀的设计。目前已完成UCloud主要模块[UMonitor](http://docs.ucloud.cn/api/umon/index.html)、[UNet](http://docs.ucloud.cn/api/unet/index.html)和[UHost](http://docs.ucloud.cn/api/uhost/index.html)的开发及测试。

### 如何使用

新建一个Maven项目，并添加UCloud-java-SDK依赖.
```xml
<dependency>
    <groupId>cn.ucloud.api</groupId>
    <artifactId>ucloud-sdk</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```
或新建普通Java项目将打包好的[jar文件](https://gitcafe.com/pingqc/ucloud-java-sdk/blob/master/lib/ucloud-sdk-0.0.1-SNAPSHOT.jar)添加到classpath中

通过创建如下类，运行就可轻松完成一次api的调用。
```java
public class Tester {

	private static String serverUrl = "http://api.ucloud.cn";
	private static String publicKey = "your public key";
	private static String privateKey = "your private key";
	private static UCloudClient client = null;
	
	public static void main(String[] args) throws ApiException, InvalidRequestException {
		client = new DefaultUCloudClient(serverUrl, publicKey, privateKey);
		
		DescribeUHostInstanceRequest req = new DescribeUHostInstanceRequest();
		req.setRegion(Region.CN_BGP_03.value());
		DescribeUHostInstanceResponse resp = client.execute(req);
		System.out.println(JSON.toJSONString(resp, true));
		
	}
}
```
如上代码，通过serverUrl、publicKey、privateKey创建一个默认的客户端，后续api的调用均可通过`client.excute(UCloudRequest)`方式执行。

另外，UCloud-Java-SDK已经所有api的请求参数进行封装（命名ActionName + Request.java， 响应数据同理）,
通过对Request、Response的封装，可以避免使用者由于对UCloud API不熟或失误导致请求参数的书写错误，增加服务器没必要的开支。

另外在再UCloudRequest接口中定义了`check()`方法，通过Hibernate-Validator对请求参数合法性（是否必填、长度控制等）进行校验(见[GetMetricRequest#check()](https://gitcafe.com/pingqc/ucloud-java-sdk/blob/master/src/main/java/cn/ucloud/api/umon/request/GetMetricRequest.java#L112)),这同样可以避免一些没必要的请求，降低服务器的压力。


### 测试

测试演示见：[/src/test/java/Test.java](https://gitcafe.com/pingqc/ucloud-java-sdk/blob/master/src/test/java/Tester.java)

注：部分api的调用会扣费，请慎重。

### 勘误

在SDK开发测试过程中，发现[`API文档`](http://docs.ucloud.cn/api/index.html)中的存在的个别问题，记录在`/doc/错误.docx`中，方便UCloud官方完善。

### 后续工作
1、完成剩余模块的开发及测试
2、调整包结构，使项目结构更加合理
3、总结本次sdk开发
