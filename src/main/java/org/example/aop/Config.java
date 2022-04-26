package org.example.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.aop")
@PropertySource("classpath:app.properties")
@EnableAspectJAutoProxy
public class Config {
}
