package com.polytech.repository;

import com.polytech.business.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public class PostRepository {

    private List<Post> db = new ArrayList<Post>();

    public void save(Post post) {
        db.add(post);
    }

    public List<Post> findAll() {
        return db;
    }
}
