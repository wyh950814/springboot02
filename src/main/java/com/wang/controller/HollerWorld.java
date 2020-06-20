package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HollerWorld {
    @RequestMapping("/page")
    public String getHollerWorld(){



        return "/img/index.html";
    }
}
