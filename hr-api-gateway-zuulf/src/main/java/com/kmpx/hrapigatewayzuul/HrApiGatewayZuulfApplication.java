package com.kmpx.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class HrApiGatewayZuulfApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayZuulfApplication.class, args);
	}

}
