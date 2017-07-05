package com.davidx.example.SpringBootMongoDB;

import com.davidx.example.SpringBootMongoDB.dao.UserDao;
import com.davidx.example.SpringBootMongoDB.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongoDbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDbApplication.class, args);
	}



	@Override
	public void run(String... strings) throws Exception {
		System.out.println("应用启动了");
	}
}
