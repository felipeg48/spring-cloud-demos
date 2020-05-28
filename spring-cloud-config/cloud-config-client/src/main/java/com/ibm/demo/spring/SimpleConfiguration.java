package com.ibm.demo.spring;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties({SimpleConfigurationProperties.class})
@Configuration
public class SimpleConfiguration {
}
