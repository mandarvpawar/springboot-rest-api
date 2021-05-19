package com.mvp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRestApiApplication {

//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootRestApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestApiApplication.class, args);
	}

//	@Bean
//	public ApplicationRunner applicationRunner(Environment environment,
//			@Value("${greeting-message:Default Hello}") String defaultValue) {
//		return args -> {
//			LOGGER.info("message from application.properties: {}",
//					environment.getProperty("message-from-application-properties"));
//			LOGGER.info("default value from application.properties: {}", defaultValue);
//		};
//	}
}
