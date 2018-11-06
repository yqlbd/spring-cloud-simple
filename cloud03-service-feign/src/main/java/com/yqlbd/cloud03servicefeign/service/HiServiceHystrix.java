package com.yqlbd.cloud03servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class HiServiceHystrix implements HiService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, " + name;
    }
}
