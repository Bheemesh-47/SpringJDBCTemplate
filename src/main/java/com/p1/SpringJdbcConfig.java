package com.p1;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.*;
@Configuration
@ComponentScan("com.exploit.jdbc")
public class SpringJdbcConfig {
    @Bean 
    public DataSource mysqlDataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(
            "jdbc:mysql://localhost:8800/springjdbc");
        dataSource.setUsername("user");
        dataSource.setPassword("password");
 
        return dataSource;
    }
}