package com.davidx.example.SpringBootMongoDB.dao;

import com.davidx.example.SpringBootMongoDB.pojo.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by xc on 17-7-5.
 */
public interface UserDao extends MongoRepository<User, Long> {

    //@Query("{'username'?0}")
    User findByUsername(String username);

    List<User> findByAge(Integer age);
}
