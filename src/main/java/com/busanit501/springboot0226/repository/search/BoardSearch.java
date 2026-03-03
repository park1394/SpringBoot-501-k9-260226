package com.busanit501.springboot0226.repository.search;

import com.busanit501.springboot0226.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardSearch {
    // 검색의 결과도 , 페이징 처리를 할 예정,
    Page<Board> search1(Pageable pageable);
}
