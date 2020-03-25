package com.kang.blog.user.dto;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    String id;
    String username;
    String password;

    @Builder
    public UserDto(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }


}
