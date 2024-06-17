package com.example.demo.command.port.in;

import com.example.demo.domain.Board;

import java.util.List;

public interface QueryAllBoardPort {
    List<Board> findAllBoard();
}
