package com.demo.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskPrint {

	@Scheduled(cron = "1 * * * * *")
	public void cron() throws Exception {
		System.out.println("测试时间："+System.currentTimeMillis());
	}
}
