package org.exampledriven.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class EchoController {

    @Value("${provider-name}")
    private String name = "nowhere";

    @RequestMapping("/")
    public String home() {
        return "This is a dynamic property loaded from " + name;
    }
}
