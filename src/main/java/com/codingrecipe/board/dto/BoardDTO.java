package com.codingrecipe.board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor // 모든필드를 매개변수로 생성자

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
