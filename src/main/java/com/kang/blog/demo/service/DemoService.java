package com.kang.blog.demo.service;

import com.kang.blog.demo.dto.DemoDto;
import com.kang.blog.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    DemoMapper mapper;

    public DemoDto selectList(String title) {
        return mapper.selectList(title);
    }



}
