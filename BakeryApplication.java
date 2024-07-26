package com.bakery.bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BakeryApplication implements CommandLineRunner {

//	@Autowired
//	cakeBaker Chocfrosting;
//	@Autowired
//	cakeBaker ChocSyrup;
//    @Autowired
//	cakeBaker Strawfrosting;
//	@Autowired
//	cakeBaker StrawSyrup;
	@Autowired
	cakeBaker CakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(BakeryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Chocfrosting.bakeCake();
//		ChocSyrup.bakeCake();
//		Strawfrosting.bakeCake();
//		StrawSyrup.bakeCake();

		CakeBaker.bakeCake();


	}
}
