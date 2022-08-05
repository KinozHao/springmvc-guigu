package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kinoz
 * @Date 2022/8/5 - 10:26
 * @apiNote
 */
@Controller
public class Index {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/return")
    public String index1(){
        return "index";
    }
}
