package com.jpk;

import com.jpk.repository.RepositoryConnectorImpl;
import com.jpk.repository.RepositoryConnector;
import com.jpk.service.ServiceImpl;
import com.jpk.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("app.properties")
public class ApplicationConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "service")
    public Service getService(){
        ServiceImpl serviceImpl = new ServiceImpl(getRepositoryConnector());
        return serviceImpl;
    }

    @Bean(name = "RepositoryConnector")
    public RepositoryConnector getRepositoryConnector(){
        return new RepositoryConnectorImpl();
    }




}
