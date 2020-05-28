package com.ibm.demo.spring;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "simple")
public class SimpleConfigurationProperties {

    private String hostname = "localhost";
    private List<String> alternateServers = new ArrayList<String>() {{ add("0.0.0.0:8181"); }};
    private int port;
    private String username;
    private String password;

}
