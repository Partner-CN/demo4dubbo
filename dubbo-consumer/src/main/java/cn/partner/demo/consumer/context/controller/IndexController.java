package cn.partner.demo.consumer.context.controller;

import cn.partner.demo.dubbo.api.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Reference
    private HelloService helloService;

    @GetMapping("")
    public String index(@RequestParam String name) {
        return helloService.sayHello(name);
    }
}
