package com.yinss;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@ConditionalOnMissingBean(Yinss.class)
@EnableConfigurationProperties(YinssProperties.class)
public class YinssAutoConfigure {
    @Resource
    YinssProperties yinssProperties;
    @Bean
    public Yinss yinss(){
        Yinss yinss = new Yinss();
        yinss.setName(yinssProperties.getName());
        yinss.setAddress(yinssProperties.getAddress());
        return yinss;
    }
}
