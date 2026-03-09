package com.busanit501.springboot0226.service;

import com.busanit501.springboot0226.dto.ReplyDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class ReplyServiceTests {

    @Autowired
    private ReplyService replyService;

    @Test
    public void testReplyRegister() {
        ReplyDTO replyDTO = ReplyDTO.builder()
                .replyText("샘플 댓글 작성 서비스 테스트 내용")
                .replyer("샘플 사용자")
                // 주의사항, 각자 데이터베이스에 게시글 번호 확인 후 작업하기.
                .bno(125L)
                .build();
        Long rno = replyService.register(replyDTO);
        log.info("작성 후, 댓글 번호 : " + rno);
    }

}
