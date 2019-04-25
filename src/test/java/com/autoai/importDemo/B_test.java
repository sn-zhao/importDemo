package com.autoai.importDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class B_test {

    @RequestMapping("/b/test")
    public String test1() {
        return "b_test";
    }
}
