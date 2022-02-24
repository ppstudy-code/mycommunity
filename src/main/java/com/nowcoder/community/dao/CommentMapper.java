package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pijiahao
 * @create 2022-01-27-20:18
 */
@Mapper
public interface CommentMapper {
    List<Comment> selectCommentsByEntity(@Param("entityType") int entityType,@Param("entityId") int entityId,@Param("offset") int offset,@Param("limit") int limit);

    int selectCountByEntity(@Param("entityType") int entityType,@Param("entityId") int entityId);

    int insertComment(Comment comment);

    Comment selectCommentById(int id);
}
