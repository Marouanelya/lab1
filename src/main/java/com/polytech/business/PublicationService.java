package com.polytech.business;

import com.polytech.repository.IPostRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public class PublicationService implements IPublicationService {

    private List<Post> liste = new ArrayList<Post>();
    private IPostRepository IPostRepository;

    public PublicationService(IPostRepository IPostRepository) {
        this.IPostRepository = IPostRepository;
    }

    public void post(Post post){
        IPostRepository.save(post);
    }

    public List<Post> fetchAll(){
        return IPostRepository.findAll();
    }

}
