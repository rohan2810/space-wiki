package com.cmpe133.spacewiki.repository;

import com.cmpe133.spacewiki.model.Post;
import com.cmpe133.spacewiki.model.Subreddit;
import com.cmpe133.spacewiki.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
