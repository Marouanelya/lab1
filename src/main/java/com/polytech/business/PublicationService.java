package com.polytech.business;

import com.polytech.repository.PostRepository;
import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public class PublicationService {

    private List<Post> liste = new ArrayList<Post>();
    private PostRepository postRepository;

    public PublicationService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void post(Post post){
        postRepository.save(post);
    }

    public List<Post> fetchAll(){
        return postRepository.findAll();
    }

}
