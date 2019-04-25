package com.autoai.importDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C_test01 {

    @RequestMapping("/c/test01")
    public String test1() {
        return "c_test01";
    }
}
