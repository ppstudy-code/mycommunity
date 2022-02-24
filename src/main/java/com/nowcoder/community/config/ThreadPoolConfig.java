package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author pijiahao
 * @create 2022-02-09-16:18
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}
