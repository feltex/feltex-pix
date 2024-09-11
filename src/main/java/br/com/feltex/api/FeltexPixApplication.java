package br.com.feltex.api;

import br.com.feltex.api.pix.PixConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PixConfig.class)
public class FeltexPixApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeltexPixApplication.class, args);
	}

}
