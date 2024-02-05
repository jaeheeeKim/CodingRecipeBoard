package com.codingrecipe.board.dto;

import com.codingrecipe.board.entity.CommentEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
//@NoArgsConstructor // 기본생성자
//@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class CommentDTO {
    private Long id;
    private String commentWriter;
    private String commentContents;
    private Long boardId;
    private LocalDateTime commentCreatedTime;

    public static CommentDTO toCommentDTO(CommentEntity commentEntity, Long boardId) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(commentEntity.getId());
        commentDTO.setCommentWriter(commentEntity.getCommentWriter());
        commentDTO.setCommentContents(commentEntity.getCommentContents());
        commentDTO.setCommentCreatedTime(commentEntity.getCreatedTime());
        commentDTO.setBoardId(boardId);
        return commentDTO;
    }
}