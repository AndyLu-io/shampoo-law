package com.shampoo.law.controller.conifg;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by luxiaobo on 2017/5/9.
 */
@ConfigurationProperties(prefix = "com.luxiaobo")
@Configuration
@PropertySource("classpath:test.properties")
public class ConfigBean {
    private String name;

    private String want;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
