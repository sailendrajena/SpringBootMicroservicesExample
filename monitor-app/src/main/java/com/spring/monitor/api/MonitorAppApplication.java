package com.spring.monitor.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MonitorAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorAppApplication.class, args);
	}

}
