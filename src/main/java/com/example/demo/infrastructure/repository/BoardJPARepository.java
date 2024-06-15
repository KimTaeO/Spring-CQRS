package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.persistence.entity.BoardJPAEntity;
import org.springframework.data.repository.CrudRepository;

public interface BoardJPARepository extends CrudRepository<BoardJPAEntity, Integer> {
}
