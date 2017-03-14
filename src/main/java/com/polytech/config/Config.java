package com.polytech.config;

import com.polytech.business.IPublicationService;
import com.polytech.business.PublicationService;
import com.polytech.repository.IPostRepository;
import com.polytech.repository.PostRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by E.Marouane on 13/03/2017.
 */

@Configuration
public class Config {

    @Bean
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("create-schema.sql")
                .build();
    }



    @Bean
    public IPostRepository postRepository(DataSource dataSource){
        return new PostRepositoryImpl(dataSource);
    }

    @Bean
    public IPublicationService publicationService(IPostRepository IPostRepository){
        return new PublicationService(IPostRepository);
    }

}

