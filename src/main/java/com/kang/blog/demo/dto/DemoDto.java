package com.kang.blog.demo.dto;


import com.kang.blog.board.entity.BoardEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class DemoDto {
    private Long id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime created_date;
    private LocalDateTime modified_date;

    public BoardEntity toEntity(){
        BoardEntity boardEntity = BoardEntity.builder()
                .id(id)
                .writer(writer)
                .title(title)
                .content(content)
                .build();
        return boardEntity;
    }

    @Builder
    public DemoDto(Long id, String title, String content, String writer, LocalDateTime created_date, LocalDateTime modified_date) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.created_date = created_date;
        this.modified_date = modified_date;
    }
}
