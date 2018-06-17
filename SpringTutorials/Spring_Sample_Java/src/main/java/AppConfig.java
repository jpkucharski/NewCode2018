import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HiberbnateCustomerRepositoryInpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan({"com.pluralsight"}) //<-- for autowiring
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }


    @Bean(name = "customerServiceImpl")
    public CustomerService getCustomerService(){
//        CustomerServiceImpl service = new CustomerServiceImpl();
        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//        service.setCustomerRepository(getCustomerRepository());
        return service;
    }

    @Bean(name = "customerRepositoryImpl")
    public CustomerRepository getCustomerRepository(){
        return new HiberbnateCustomerRepositoryInpl();
    }


}
