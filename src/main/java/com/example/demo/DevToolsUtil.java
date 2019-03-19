package com.example.demo;

import org.springframework.util.ClassUtils;

public class DevToolsUtil {
    public static boolean isDeveloping() {
        return ClassUtils.isPresent("org.springframework.boot.devtools.settings.DevToolsSettings",
                ClassLoader.getSystemClassLoader());
    }
}
