package com.kang.blog.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;


@Getter
@Setter
@ToString
public class Now {

    private LocalDateTime localTime;
    private OffsetDateTime offsetTime;
    private Date date;


    public Now() {
        localTime = LocalDateTime.now();
        offsetTime = OffsetDateTime.now();
        date = new Date();
    }

}



