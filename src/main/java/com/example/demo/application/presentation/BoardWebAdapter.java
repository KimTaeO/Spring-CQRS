package com.example.demo.application.presentation;

import com.example.demo.application.data.dto.request.SaveBoardRequest;
import com.example.demo.application.data.dto.response.QueryAllBoardResponse;
import com.example.demo.application.usecase.QueryAllBoardUseCase;
import com.example.demo.application.usecase.SaveBoardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardWebAdapter {
    private final SaveBoardUseCase saveBoardUseCase;
    private final QueryAllBoardUseCase queryAllBoardUseCase;

    @PostMapping
    public ResponseEntity<Void> saveBoard(@RequestBody SaveBoardRequest saveBoardRequest) {
        saveBoardUseCase.execute(saveBoardRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping
    public ResponseEntity<List<QueryAllBoardResponse>> queryAllBoard() {
        List<QueryAllBoardResponse> response = queryAllBoardUseCase.QueryAllBoard();
        return ResponseEntity.ok(response);
    }
}
