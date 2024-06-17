package com.example.demo.command.usecase;

import com.example.demo.command.data.dto.response.QueryAllBoardResponse;
import com.example.demo.command.port.in.BoardPort;
import com.example.demo.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class QueryAllBoardUseCase {
    private final BoardPort boardPort;

    public List<QueryAllBoardResponse> QueryAllBoard() {
        List<Board> boards = boardPort.findAllBoard();

        return boards.stream().map(board ->
                new QueryAllBoardResponse(
                        board.id(),
                        board.title(),
                        board.content()
                )
        ).toList();
    }
}
