package com.kang.blog.board.service;

import com.kang.blog.board.dto.BoardDto;
import com.kang.blog.board.entity.BoardEntity;
import com.kang.blog.board.repository.BoardRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class BoardService {
    private BoardRepository boardRepository;


    public List<BoardDto> getBoardList() {
        List<BoardEntity> boardEntities = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();

        for ( BoardEntity boardEntity : boardEntities) {
            BoardDto boardDTO = BoardDto.builder()
                    .id(boardEntity.getId())
                    .title(boardEntity.getTitle())
                    .content(boardEntity.getContent())
                    .writer(boardEntity.getWriter())
                    .createdDate(boardEntity.getCreatedDate())
                    .build();

            boardDtoList.add(boardDTO);
        }

        return boardDtoList;

    }

    @Transactional
    public Long savePost(BoardDto boardDto) {
        log.debug("gid = > " );
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}