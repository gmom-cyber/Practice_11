package Practice_11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringForPractice11 {
    public static void main(String[] args) {
        SpringApplication.run(SpringForPractice11.class, args);

        Test test = new Test();
        test.page();
        test.display();
    }
}
