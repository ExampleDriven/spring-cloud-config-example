package org.exampledriven.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EchoController {

    @Value("${name}")
    String name = "World";

    @RequestMapping("/")
    public String home() {
        return "Hello " + name;
    }
}
