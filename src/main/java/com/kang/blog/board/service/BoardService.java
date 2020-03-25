package com.kang.blog.board.service;

import com.kang.blog.board.repository.BoardRepository;
import com.kang.blog.board.entity.BoardEntity;
import com.kang.blog.board.dto.BoardDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}