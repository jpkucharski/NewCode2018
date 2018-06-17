import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

public static void main (String [] arg){


    ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//    CustomerService service = new CustomerServiceImpl();

    CustomerService service = appContext.getBean("customerServiceImpl", CustomerService.class);
//    System.out.println(service);

    System.out.println(service.findAll().get(0).getFirstname());

//    CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
//    System.out.println(service2);
//
//
//    System.out.println(service.findAll().get(0).getFirstname());



}


}
