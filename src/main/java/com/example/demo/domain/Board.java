package com.example.demo.domain;

import lombok.Builder;

@Builder
public record Board(
        Integer id,
        String title,
        String content
) {
}
