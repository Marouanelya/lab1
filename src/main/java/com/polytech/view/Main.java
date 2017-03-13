package com.polytech.view;

import com.polytech.business.Post;
import com.polytech.business.PublicationService;
import com.polytech.repository.PostRepository;

import java.util.List;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        PostRepository postRepository = new PostRepository();
        PublicationService publicationService = new PublicationService(postRepository);
        Post post = new Post("Hello World");
        publicationService.post(post);
        List<Post> posts = publicationService.fetchAll();
        System.out.print(posts);
    }
}