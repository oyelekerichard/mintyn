package com.mintyn.app.configs;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mintyn")
@Data
public class MintynProperties {

    private String baseUrl;
}
