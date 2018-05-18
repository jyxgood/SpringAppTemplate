package com.thirdpart.shophelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan
@Import({MybatisConfig.class, ScheduleConfigration.class})
public class ShophelpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShophelpApplication.class, args);
	}
}
