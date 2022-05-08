package compraventa;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdanBouhaouitaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdanBouhaouitaSpringApplication.class, args);
	}
	
	@Bean
    public DozerBeanMapper Mapper() {
        return new DozerBeanMapper ();
    }

}
