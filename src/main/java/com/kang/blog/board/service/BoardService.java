package com.kang.blog.board.service;

import com.kang.blog.board.dto.BoardDto;
import com.kang.blog.board.repository.BoardRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
@Slf4j
public class BoardService {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto) {
        log.debug("gid = > " );
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}