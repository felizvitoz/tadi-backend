package com.tadi.user.service.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.tadi.repository"})
@EntityScan("com.tadi.entity")
public class JPAConfig {
}
