package com.autoai.importDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class B_test02 {

    @RequestMapping("/b/test02")
    public String test1() {
        return "b_test03";
    }
}

