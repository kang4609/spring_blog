package com.kang.blog.board.controll;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.kang.blog.board.dto.BoardDto;
import com.kang.blog.board.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Api(tags = {"1. User"})
@Controller
@AllArgsConstructor
@Slf4j
public class BoardController {
    private BoardService boardService;

    @ApiOperation(value = "게시판 조회", notes = "모든 게시판을 조회한다")
    @GetMapping("/board")
    public String list(Model model) {
        log.debug("board/list = >>>>>>>>> " );

       List<BoardDto> boardList =  boardService.getBoardList();
       model.addAttribute("boardList", boardList);
       return "board/list";
    }

    @ApiOperation(value = "게시판 등록", notes = "모든 게시판을 등록한다")
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