package com.kang.blog.board.controll;

import org.springframework.web.bind.annotation.GetMapping;
import com.kang.blog.board.dto.BoardDto;
import com.kang.blog.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    @GetMapping("/board")
    public String list() {
        return "board/list";
    }

    @GetMapping("/board/post")
    public String write() {
        return "board/write";
    }

    @PostMapping("/board/post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);
        return "redirect:/board";
    }
}