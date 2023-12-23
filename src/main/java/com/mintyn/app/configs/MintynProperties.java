package com.mintyn.app.configs;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mintyn")
public class MintynProperties {

    private String baseUrl;
}
