package com.xat.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 淡漠
 * MybatisConfig 配置类
 */
@Configuration
@MapperScan("com.xat.mall.mbg.mapper")
public class MybatisConfig {

}



