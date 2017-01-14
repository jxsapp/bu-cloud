package org.bu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class BuCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuCloudApplication.class, args);
	}
}
