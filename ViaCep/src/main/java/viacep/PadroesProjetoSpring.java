package viacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PadroesProjetoSpring {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSpring.class, args);
	}

}