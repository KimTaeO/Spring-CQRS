package com.example.demo.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class BoardJPAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;
    private final String title;
    private final String content;
}
