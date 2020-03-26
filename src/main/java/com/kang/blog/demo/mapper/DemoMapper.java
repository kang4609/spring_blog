package com.kang.blog.demo.mapper;


import com.kang.blog.demo.dto.DemoDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {
     DemoDto selectList(String title);
}
