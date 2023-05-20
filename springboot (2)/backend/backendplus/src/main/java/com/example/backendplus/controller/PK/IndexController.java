package com.example.backendplus.controller.PK;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname IndexController
 * @Description TODO
 * @Date 2022/10/3 18:14
 * @Created by PoisonGodv
 */


@Controller
@RequestMapping("/pk/")
public class IndexController {
    @RequestMapping("index/")
    public String index(){
        return "pk/index.html";
    }

}
