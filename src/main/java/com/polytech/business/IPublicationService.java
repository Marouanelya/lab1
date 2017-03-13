package com.polytech.business;

import java.util.List;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public interface IPublicationService {

    void post(Post post);
    List<Post> fetchAll();

}
