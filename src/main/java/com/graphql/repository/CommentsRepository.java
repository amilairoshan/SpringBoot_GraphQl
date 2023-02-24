package com.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.model.PostComments;

@Repository
public interface CommentsRepository extends JpaRepository<PostComments, Long> {

}
