package com.cgi.hexagon.starter;


import com.cgi.hexagon.bonnieinmemstorage.InMemStorageConfiguration;
import com.cgi.hexagon.bonnierest.BonnieRestConfiguration;
import com.cgi.hexagon.businessrules.OrderLoader;
import com.cgi.hexagon.businessrules.OrderService;
import com.cgi.hexagon.h2storage.H2StorageApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BonnieRestConfiguration.class, H2StorageApplication.class})
public class BonnieConfiguration {

    @Bean
    OrderService orderService(OrderLoader orderStorage) {
        return new OrderService(orderStorage);
    }
}
