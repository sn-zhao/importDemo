package com.autoai.importDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A_test01 {

    @RequestMapping("/test")
    public String test1() {
        return "test";
    }
}
