package com.brjann.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.brjann.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}