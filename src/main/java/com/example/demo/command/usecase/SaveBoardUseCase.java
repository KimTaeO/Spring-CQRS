package com.example.demo.command.usecase;

import com.example.demo.command.data.dto.request.SaveBoardRequest;
import com.example.demo.command.port.in.BoardPort;
import com.example.demo.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class SaveBoardUseCase {
    private final BoardPort boardPort;
    public void execute(SaveBoardRequest saveBoardRequest) {
        Board board = Board.builder()
                .title(saveBoardRequest.title())
                .content(saveBoardRequest.content())
                .build();

        boardPort.saveBoard(board);
    }
}
