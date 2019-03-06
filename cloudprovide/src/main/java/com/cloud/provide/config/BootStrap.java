package com.cloud.provide.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class BootStrap {

    private static String name;

    @Value("${name}")
    public void setName(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }
}
