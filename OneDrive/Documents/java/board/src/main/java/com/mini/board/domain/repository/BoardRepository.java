package com.mini.board.domain.repository;

import com.mini.board.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// 데이터 조작을 담당 JpaReopsitory<entity클래스, pk타입>
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findByTitleContaining(String keyword);
}
