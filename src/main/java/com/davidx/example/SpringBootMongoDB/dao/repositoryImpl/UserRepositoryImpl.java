package com.davidx.example.SpringBootMongoDB.dao.repositoryImpl;

import com.davidx.example.SpringBootMongoDB.dao.UserRepositoryCustom;
import com.davidx.example.SpringBootMongoDB.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * Created by xc on 17-7-5.
 */
@Component
public class UserRepositoryImpl implements UserRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void updateUser(User user) {
        Query query=new Query(Criteria.where("id").is(user.getId()));
        Update update= new Update().set("username", user.getUsername()).set("age", user.getAge());
        //更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query,update,User.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,User.class);
    }
}
