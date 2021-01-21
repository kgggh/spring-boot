package com.bugny.myboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugny.myboot.domain.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
