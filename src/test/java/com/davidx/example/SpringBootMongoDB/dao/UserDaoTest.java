package com.davidx.example.SpringBootMongoDB.dao;

import com.davidx.example.SpringBootMongoDB.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by xc on 17-7-5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao repository;
    @Test
    public void findByUsername() throws Exception {
        repository.deleteAll();

        // save a couple of customers
        repository.save(new User(1l,"Alice", 25));
        repository.save(new User(2l,"David", 25));
        repository.save(new User(3l,"Bob", 30));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (User user : repository.findAll()) {
            System.out.println(user.getId());
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByUsername("Alice").getUsername());

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (User user : repository.findByAge(25)) {
            System.out.println(user.getUsername());
        }
    }

}