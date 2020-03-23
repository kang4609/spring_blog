package com.kang.blog.controll;

import com.kang.blog.dto.UserDto;
import com.kang.blog.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class UserControll {

    private UserService userService;

    // 메인 페이지
    @GetMapping("/")
    public String index() {
        return "/home";
    }


    // 회원가입 처리
    @PostMapping("/user/signup")
    public String execSignup(UserDto userDto) {
     //   memberService.joinUser(userDto);

        return "redirect:/user/login";
    }

    // 로그인 페이지
    @GetMapping("/login")
    public String dispLogin() {

        System.out.println("Controll Loing");
        return "/login";
    }

    // 로그인 결과 페이지
    @GetMapping("/hello")
    public String dispLoginResult() {
        return "/hello";
    }

    // 로그아웃 결과 페이지
    @GetMapping("/user/logout/result")
    public String dispLogout() {
        return "/logout";
    }

    // 접근 거부 페이지
    @GetMapping("/user/denied")
    public String dispDenied() {
        return "/denied";
    }


}

