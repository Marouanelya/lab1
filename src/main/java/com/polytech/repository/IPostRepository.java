package com.polytech.repository;

import com.polytech.business.Post;

import java.util.List;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public interface IPostRepository {

    void save(Post post);
    List<Post> findAll();

}
