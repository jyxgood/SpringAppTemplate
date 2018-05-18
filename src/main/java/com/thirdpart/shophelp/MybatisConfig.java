package com.thirdpart.shophelp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * created by yixinjiang on 2018/5/18
 */
@Configuration
public class MybatisConfig {
    /**
     * mybatis config
     * @return
     */
    @Bean
    public MapperScannerConfigurer mapperScanner(){
        MapperScannerConfigurer configurer=new MapperScannerConfigurer();
        configurer.setBasePackage("com.thirdpart.shophelp.dao");
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return configurer;
    }
}
