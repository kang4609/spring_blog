package com.kang.blog.demo.controll;

import com.kang.blog.demo.dto.DemoDto;
import com.kang.blog.demo.service.DemoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
@Slf4j
public class DemoController {

    @Autowired
    private DemoService  demoService;

    @GetMapping("/demo")
    public String list(Model model) {
        log.debug("board/list = >>>>>>>>> " );
        DemoDto dto = demoService.selectList("test");
        model.addAttribute("demo", dto);
       return "demo/list";
    }

}