package com.cmpe133.spacewiki.repository;

import com.cmpe133.spacewiki.model.Comment;
import com.cmpe133.spacewiki.model.Post;
import com.cmpe133.spacewiki.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}

