package com.componentscan.with_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // this tells, this is a configuration class, you can load all the config here
@ComponentScan(basePackages = "com.componentscan.with_annotation")
public class AppConfig {
}
