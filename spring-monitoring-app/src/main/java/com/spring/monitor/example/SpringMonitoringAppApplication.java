package com.spring.monitor.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringMonitoringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMonitoringAppApplication.class, args);
	}

}
