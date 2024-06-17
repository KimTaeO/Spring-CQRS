package com.example.demo.infrastructure.persistence;

import com.example.demo.command.port.in.BoardPort;
import com.example.demo.domain.Board;
import com.example.demo.infrastructure.mapper.BoardMapper;
import com.example.demo.infrastructure.persistence.entity.BoardJPAEntity;
import com.example.demo.infrastructure.repository.BoardJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class BoardPersistenceAdapter implements BoardPort {
    private final BoardJPARepository boardJPARepository;
    private final BoardMapper boardMapper;

    @Override
    public void saveBoard(Board board) {
        BoardJPAEntity boardJPAEntity = boardMapper.toEntity(board);

        boardJPARepository.save(boardJPAEntity);
    }

    @Override
    public List<Board> findAllBoard() {
        List<BoardJPAEntity> boardJPAEntities = boardJPARepository.findAll();

        return boardJPAEntities.stream().map(
                boardMapper::toDomain
        ).toList();
    }
}
