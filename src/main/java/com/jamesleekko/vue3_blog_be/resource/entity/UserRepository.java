package com.jamesleekko.vue3_blog_be.resource.entity;

import org.springframework.data.repository.CrudRepository;
import com.jamesleekko.vue3_blog_be.resource.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}