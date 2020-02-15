package com.sg.assigment.bonus;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sg.assigment.bonus.context.ApplicationContextHolder;
import com.sg.assigment.bonus.language.demo.Rooster;

@SpringBootApplication
public class BonusTestApplication implements CommandLineRunner {
	
	public static void main(String[] args)  throws InterruptedException {
		SpringApplication.run(BonusTestApplication.class, args);
		Thread.sleep(2000);
		
	}


	public void run(String... args) throws Exception {
		Rooster rootster = ApplicationContextHolder.getBean(Rooster.class);
		rootster.sing();
	}

}
