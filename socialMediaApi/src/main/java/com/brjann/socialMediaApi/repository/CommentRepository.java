package com.brjann.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.brjann.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}