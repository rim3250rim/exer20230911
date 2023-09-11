package com.codingrecipe.board.entity;

import com.codingrecipe.board.dto.BoardDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

//디비의 테이블 역할을 하는 클래스
@Entity
@Getter
@Setter
@Table(name = "board_table")

public class BoardEntity  extends BaseEntity{
    @Id //pk컬럼 지정 필수
    @GeneratedValue(strategy = GenerationType.AUTO) //auto_increment

    @Column(length = 20, nullable = false)
    private String boardWriter;
    @Column // 크기 255 , null가능 상태
    private String boardPass;
    @Column
    private String boardTitle;
    @Column(length = 500)
    private String boardContents;
    @Column
    private int boardHits;

    public static BoardEntity toSaveEntity(BoardDTO boardDTO){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setBoardWriter(boardDTO.getBoardWriter());
        boardEntity.setBoardPass(boardDTO.getBoardPass());
        boardEntity.setBoardTitle(boardDTO.getBoardTitle());
        boardEntity.setBoardContents(boardDTO.getBoradContents());
        boardEntity.setBoardHits(0);
        return boardEntity;
    }

}
