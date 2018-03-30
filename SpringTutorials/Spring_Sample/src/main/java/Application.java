import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

import java.util.List;

public class Application {

public static void main (String [] arg){

    CustomerService service = new CustomerServiceImpl();

    System.out.println(service.findAll().get(0).getFirstname());



}


}
