package com.hisrealm.harbor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    private String index(){

        return "index";
    }


    @RequestMapping("/")
    private String welcome(){
        return "welocome";
    }

}
