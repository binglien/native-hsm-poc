package com.hitrust.mgear.demo.msecure.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

@SpringBootApplication
@ComponentScan(basePackages = { "com.hitrust.mgear.demo.msecure.springboot",
		"com.hitrust.mgear.demo.msecure.stream.source", "com.hitrust.mgear.demo.msecure.stream.processor",
		"com.hitrust.mgear.demo.msecure.stream.sink", 
		"${msecure.base-packages.1:NothingToScan11}", "${msecure.base-packages.2:NothingToScan12}",
		"${msecure.base-packages.3:NothingToScan13}", "${msecure.base-packages.4:NothingToScan14}",
		"${msecure.base-packages.5:NothingToScan15}", "${msecure.base-packages.6:NothingToScan16}",
		"${msecure.base-packages.7:NothingToScan17}", "${msecure.base-packages.8:NothingToScan18}",
		"${msecure.base-packages.9:NothingToScan19}", "${msecure.base-packages.10:NothingToScan11}",
		"${msecure.base-packages.11:NothingToScan11}", "${msecure.base-packages.12:NothingToScan12}",
		"${msecure.base-packages.13:NothingToScan13}", "${msecure.base-packages.14:NothingToScan14}",
		"${msecure.base-packages.15:NothingToScan15}", "${msecure.base-packages.16:NothingToScan16}",
		"${msecure.base-packages.17:NothingToScan17}", "${msecure.base-packages.18:NothingToScan18}",
		"${msecure.base-packages.19:NothingToScan18}", "${msecure.base-packages.20:NothingToScan19}" })
public class MSecureConsumerApplication {
	private static final Logger LOG = LoggerFactory.getLogger(MSecureConsumerApplication.class);


	public static List<String> commandList = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		LOG.info("Starting Consumer mSecure application...");
		
		new SpringApplicationBuilder(MSecureConsumerApplication.class).web(WebApplicationType.NONE)
		.run(args);
	}


}
