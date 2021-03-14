package ec.gob.epmmop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class RegistroCoordenadasApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(RegistroCoordenadasApplication.class, args);
	}
	
	protected SpringApplicationBuilder configura(SpringApplicationBuilder builder) {
		return builder.sources(RegistroCoordenadasApplication.class);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}

}
