package com.cas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringBootApplication(scanBasePackages = "com.cas")
public class XxlJobAdminApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(XxlJobAdminApplication.class, args);
			System.out.println("调用中心启动成功！！！！");
		} catch (Exception e) {
			System.out.println("调度中心启动失败！！！！");
		}
	}
}