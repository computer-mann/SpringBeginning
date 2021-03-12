package com.example.tsclientconnectivity;

import com.example.tsclientconnectivity.models.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TsClientConnectivityApplication {

	// adding this comment to see it show up in the dev remote branch
	// this should only show up in the pubsub branch
	public static void main(String[] args) {
		SpringApplication.run(TsClientConnectivityApplication.class, args);


	}



}
