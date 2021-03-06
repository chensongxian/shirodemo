package com.csx.shirodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = {"com.csx.shirodemo.mapper"})
public class ShirodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShirodemoApplication.class, args);
	}
}
