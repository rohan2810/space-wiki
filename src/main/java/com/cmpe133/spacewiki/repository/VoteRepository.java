package com.cmpe133.spacewiki.repository;

import com.cmpe133.spacewiki.model.Post;
import com.cmpe133.spacewiki.model.User;
import com.cmpe133.spacewiki.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
