package com.polytech.config;

import com.polytech.business.IPublicationService;
import com.polytech.business.PublicationService;
import com.polytech.repository.IPostRepository;
import com.polytech.repository.PostRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by E.Marouane on 13/03/2017.
 */

@Configuration
public class Config {

    @Bean
    public IPostRepository postRepository(){
        return new PostRepositoryImpl();
    }

    @Bean
    public IPublicationService publicationService(IPostRepository IPostRepository){
        return new PublicationService(IPostRepository);
    }


}

