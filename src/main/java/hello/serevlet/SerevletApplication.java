package hello.serevlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿 자동 등록 어노테이션
@SpringBootApplication
public class SerevletApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerevletApplication.class, args);
	}


}
