package com.codingrecipe.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
@GetMapping("/save")
  public String saveForm(){
    return "save";}

    @PostMapping("/save")
  public String save(){   // = @RequestParam("boardWriter")String boardWriter) 대신dto객체에 담아서 컨트롤로러 넘어오게끔
  return null;
    }

}