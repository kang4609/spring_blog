package com.kang.blog.demo.controll;

import com.kang.blog.demo.dto.Now;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/now")
    public Now time() {
        return new Now();
    }

}