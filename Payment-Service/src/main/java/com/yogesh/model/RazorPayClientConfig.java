package com.yogesh.model;
 
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
 

@Component
@ConfigurationProperties(prefix = "razorpay")
public class RazorPayClientConfig {
    private String key;
    private String secret;
}