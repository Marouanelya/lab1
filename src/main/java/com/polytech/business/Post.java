package com.polytech.business;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public class Post {

    private String content;

    public Post(String context){
        this.content = context;
    }

    public String getContent(){
        return content;
    }

    @Override
    public String toString() {
        return content;
    }
}
