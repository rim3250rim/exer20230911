package com.codingrecipe.board.service;


import com.codingrecipe.board.dto.BoardDTO;
import com.codingrecipe.board.entity.BoardEntity;
import com.codingrecipe.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
//dto를 entity로 변환
//entity를 dot로 변환
@Service
@RequiredArgsConstructor
public class BoardService  {
private final BoardRepository boardRepository; //생성자 주입방식
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
