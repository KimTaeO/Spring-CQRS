package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.persistence.entity.BoardJPAEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoardJPARepository extends CrudRepository<BoardJPAEntity, Integer> {
    List<BoardJPAEntity> findAll();
}
