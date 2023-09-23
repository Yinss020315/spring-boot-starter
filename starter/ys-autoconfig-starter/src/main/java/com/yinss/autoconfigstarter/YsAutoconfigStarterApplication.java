package com.yinss.autoconfigstarter;

import com.yinss.Yinss;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class YsAutoconfigStarterApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(YsAutoconfigStarterApplication.class, args);
		Yinss bean = ctx.getBean(Yinss.class);
		System.out.println(bean);
	}

}
