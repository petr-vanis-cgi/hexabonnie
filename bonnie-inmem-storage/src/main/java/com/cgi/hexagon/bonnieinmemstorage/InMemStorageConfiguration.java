package com.cgi.hexagon.bonnieinmemstorage;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.cgi.hexagon.bonnieinmemstorage"})
public class InMemStorageConfiguration {

}
