package com.example.demo.command.data.dto.request;

import lombok.RequiredArgsConstructor;

public record SaveBoardRequest(
        String title,
        String content
) {
}
