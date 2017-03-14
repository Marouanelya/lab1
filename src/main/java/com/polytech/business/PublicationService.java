package com.polytech.business;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public class PublicationService implements IPublicationService {

    private List<Post> liste = new ArrayList<Post>();
    private com.polytech.repository.IPostRepository IIPostRepository;


    public PublicationService(com.polytech.repository.IPostRepository IIPostRepository) {
        this.IIPostRepository = IIPostRepository;
    }

    public void post(Post post){
        IIPostRepository.save(post);
    }

    public List<Post> fetchAll(){
        return IIPostRepository.findAll();
    }

}
