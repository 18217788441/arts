package com.arts.service;

import com.gepholding.log.constant.MDCPropertyConsts;
import java.util.UUID;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 服务启动
 * <p>
 * 1.
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.gepholding" , "com.arts.service"})
@MapperScan(value = "tk.mybatis.mapper.annotation", basePackages = "com.arts.service.mapper")
public class Application {
    public static void main(String[] args) {
        MDC.put(MDCPropertyConsts.TRACE_LOG_ID, UUID.randomUUID().toString());
        SpringApplication.run(Application.class, args);
    }
}
