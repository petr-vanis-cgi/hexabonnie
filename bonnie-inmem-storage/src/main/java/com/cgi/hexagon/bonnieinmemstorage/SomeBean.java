package com.cgi.hexagon.bonnieinmemstorage;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {

    public void doWrite(String aThing) {
        System.out.println("SomeBeanWrites: " + aThing);
    }
}
