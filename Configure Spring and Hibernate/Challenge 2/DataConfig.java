package com.teamtreehouse.contactmgr.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
@Configuration

public class DataConfig {
  @Bean
  public DataSource dataSource()
  {
   BasicDataSource dataSource = new BasicDataSource();
   dataSource.setDriverClassName("org.h2.Driver");
   dataSource.setUrl("jdbc:h2:mem:contactmgr");
    return dataSource;
  }

}
