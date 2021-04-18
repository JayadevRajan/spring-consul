package com.awesomesoftware.identityservice;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@RefreshScope
@NoArgsConstructor
@Component
@Data
@ConfigurationProperties(prefix = "identify-app")
public class UserConfiguration {

    @Data
    public static class User{
        private int sessionTimeout;
        private boolean sendNotification;
    }

    private User user;
}
