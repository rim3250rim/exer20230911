package com.codingrecipe.board.dto;

import java.time.LocalDateTime;

public class BoardDTO {
private Long id;
private String boardWriter;
private String boardPass;
private String boardTitle;
private String boradContents;
private int boardHits; // 조회수
private LocalDateTime boardCreatedTime;
private LocalDateTime boardUpdatedTime;

}
