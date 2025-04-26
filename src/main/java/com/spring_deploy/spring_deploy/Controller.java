package com.spring_deploy.spring_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String getIndex() {
        return "{'Message': Hello ,World!!!}";
    }
    
}
