package com.gwq.cnotf.configuratiom;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 00:00 2019/06/17
 */
@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "ds1SProperties")
    @Qualifier("ds1SProperties")
    @ConfigurationProperties(prefix = "spring.datasource.ds1")
    public DataSourceProperties xxDS1Properties() {//这是是用hikariCP的时候用的
        return new DataSourceProperties();
    }

    @Bean(name = "ds2Properties")
    @Qualifier("ds2Properties")
    @ConfigurationProperties(prefix = "spring.datasource.ds2")
    public DataSourceProperties xxDS2Properties() {
        return new DataSourceProperties();
    }


    @Primary
    @Bean(name = "ds1")
    @Qualifier("ds1")
    @ConfigurationProperties(prefix = "spring.datasource.ds1")
    public HikariDataSource dataSourceOrder() {
        //return DruidDataSourceBuilder.create().build(); //使用druidCP时打开这个注释，同时注释掉下面一行
        return xxDS1Properties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean(name = "ds2")
    @Qualifier("ds2")
    @ConfigurationProperties(prefix = "spring.datasource.ds2")
    public HikariDataSource dataSourceAuth() {
        return xxDS2Properties().initializeDataSourceBuilder().type(HikariDataSource.class).build();

    }
}
