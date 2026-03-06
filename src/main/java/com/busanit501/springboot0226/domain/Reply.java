package com.busanit501.springboot0226.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "board") // 댓글 테이블 내용만 조회를 하겠다. 부모 게시글는 조회 안하겠다.
public class Reply extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno; // 댓글 번호

    @ManyToOne(fetch = FetchType.LAZY)
    private Board board; // 부모 게시글, 늦게 조회할 예정. 해당 데이터 조회할 당시에 테이블 검색을 하겠다.

    private String replyText; // 댓글 내용
    private String replyer; // 댓글 작성자

}
