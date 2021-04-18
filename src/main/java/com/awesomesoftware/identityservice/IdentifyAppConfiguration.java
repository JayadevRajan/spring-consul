package com.awesomesoftware.identityservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties(UserConfiguration.class)
public class IdentifyAppConfiguration {
}
