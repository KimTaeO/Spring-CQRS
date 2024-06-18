package com.example.demo.application.port.in;

import com.example.demo.domain.Board;

import java.util.List;

public interface QueryAllBoardPort {
    List<Board> findAllBoard();
}
