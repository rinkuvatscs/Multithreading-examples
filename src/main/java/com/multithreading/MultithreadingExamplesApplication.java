package com.multithreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.multithreading.using.thread.cls.example.PrintThread;

@SpringBootApplication
public class MultithreadingExamplesApplication {

	public static void main(String[] args) {
		org.springframework.context.ConfigurableApplicationContext context = SpringApplication
				.run(MultithreadingExamplesApplication.class, args);
		
		PrintThread printThread = context.getBean(PrintThread.class);
		printThread.setName("Thread 1");
		
		PrintThread printThread2 = context.getBean(PrintThread.class);
		printThread.setName("Thread 2");
		
		PrintThread printThread3 = context.getBean(PrintThread.class);
		printThread.setName("Thread 3");
		
		PrintThread printThread4 = context.getBean(PrintThread.class);
		printThread.setName("Thread 4");
		
		PrintThread printThread5 = context.getBean(PrintThread.class);
		printThread.setName("Thread 5");
		
		
		printThread.start();
    	printThread2.start();
    	printThread3.start();
    	printThread4.start();
    	printThread5.start();
    	
    	context.stop();
		
	}
	
	
	@Bean
	public org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor threadPoolExecutor() {
		org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor threadPoolExecutor = new org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor() ;
		threadPoolExecutor.setMaxPoolSize(10);
		threadPoolExecutor.setCorePoolSize(5);
		
		return threadPoolExecutor;
	}
	
}
