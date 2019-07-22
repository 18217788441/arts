package com.arts.service.config;

import java.io.File;
import javax.servlet.MultipartConfigElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 上传文件路径配置
 * <p>
 * 1.
 * </p>
 *
 * @author : system
 * @version : 1.0.0
 * @date : 2019-07-19 16:03:12
 */
@Configuration
public class MultipartConfigConfig {

    @Value("${file.tmp:/data/tmp}")
    private String fileTmp;

    /**
    * 文件上传临时路径
    */
    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        File tmpFile = new File(fileTmp);
        if (!tmpFile.exists()) {
            tmpFile.mkdirs();
        }
        factory.setLocation(fileTmp);
        return factory.createMultipartConfig();
    }

}