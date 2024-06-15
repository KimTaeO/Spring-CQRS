package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.Board;
import com.example.demo.infrastructure.persistence.entity.BoardJPAEntity;
import org.springframework.stereotype.Component;

@Component
public class BoardMapper {
    public Board toDomain(BoardJPAEntity boardJPAEntity) {
        return Board.builder()
                .id(boardJPAEntity.getId())
                .title(boardJPAEntity.getTitle())
                .content(boardJPAEntity.getContent())
                .build();
    }

    public BoardJPAEntity toEntity(Board board) {
        return BoardJPAEntity.builder()
                .id(board.id())
                .title(board.title())
                .content(board.content())
                .build();
    }
}
