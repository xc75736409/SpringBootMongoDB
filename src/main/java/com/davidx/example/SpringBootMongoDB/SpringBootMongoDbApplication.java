package com.davidx.example.SpringBootMongoDB;

import com.davidx.example.SpringBootMongoDB.dao.UserDao;
import com.davidx.example.SpringBootMongoDB.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongoDbApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
	}


}
