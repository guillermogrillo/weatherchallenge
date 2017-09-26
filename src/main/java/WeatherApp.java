import controller.WeatherController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class WeatherApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WeatherController.class, args);
    }


}
