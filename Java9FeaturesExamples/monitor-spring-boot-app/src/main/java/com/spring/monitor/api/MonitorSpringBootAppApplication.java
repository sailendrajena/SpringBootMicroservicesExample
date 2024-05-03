package com.spring.monitor.api;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MonitorSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorSpringBootAppApplication.class, args);
	}

}
