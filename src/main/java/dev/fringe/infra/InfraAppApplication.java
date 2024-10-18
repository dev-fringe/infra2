package dev.fringe.infra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class InfraAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfraAppApplication.class, args);
	}
	
	@Scheduled(fixedDelay =  5000)
	public void shed() {
		System.out.println("Hello");
	}

}
