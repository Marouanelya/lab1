package com.polytech.repository;

import com.polytech.business.Post;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by E.Marouane on 13/03/2017.
 */
public class PostRepositoryImpl implements IPostRepository {

    private final DataSource dataSource;

    public PostRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void save(Post post) {
        try{
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into POST (CONTENT) values (?)");
            preparedStatement.setString(1, post.getContent());
            preparedStatement.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Post> findAll() {
        List<Post> liste = new ArrayList<Post>();
        try{
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from POST");
            while(resultSet.next()){
                liste.add(new Post(resultSet.getString("CONTENT")));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return liste;
    }
}
