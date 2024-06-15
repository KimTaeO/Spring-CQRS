package com.example.demo.command.presentation;

import com.example.demo.command.data.dto.request.SaveBoardRequest;
import com.example.demo.command.usecase.SaveBoardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardWebAdapter {
    private final SaveBoardUseCase saveBoardUseCase;

    @PostMapping
    public ResponseEntity<Void> saveBoard(@RequestBody SaveBoardRequest saveBoardRequest) {
        saveBoardUseCase.execute(saveBoardRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
