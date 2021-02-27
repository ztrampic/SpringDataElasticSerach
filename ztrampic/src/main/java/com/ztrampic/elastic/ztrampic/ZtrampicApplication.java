package com.ztrampic.elastic.ztrampic;

import com.ztrampic.elastic.ztrampic.service.UserService;
import com.ztrampic.elastic.ztrampic.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZtrampicApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZtrampicApplication.class, args);
	}

}
