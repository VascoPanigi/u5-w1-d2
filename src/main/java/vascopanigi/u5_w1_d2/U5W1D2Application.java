package vascopanigi.u5_w1_d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vascopanigi.u5_w1_d2.entities.Menu;

@SpringBootApplication
public class U5W1D2Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D2Application.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5W1D2Application.class);

        Menu menu = context.getBean(Menu.class);
        menu.printMenu();
    }

}
