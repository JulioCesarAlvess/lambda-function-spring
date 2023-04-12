package example;

import java.util.function.Function;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FunctionConfiguration {

	public static void main(String[] args) {}

	@Bean
	public Function<String, String> uppercase() {
		return value -> new StringBuilder(value).reverse().toString();
	}
}
