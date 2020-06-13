package cn.partner.demo.dubbo.provider.context.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @PostMapping("")
    public String index() {
        return "ok";
    }
}
