//modelo
//interface
//repositorio
//servicio
//controlador


package RETOC45KENWAY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import RETOC45KENWAY.interfaces.InterfaceChocolate;
import RETOC45KENWAY.interfaces.InterfaceOrder;
import RETOC45KENWAY.interfaces.InterfaceUser;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

@Component
@SpringBootApplication
public class Reto3WebApplication implements CommandLineRunner {
    
   @Autowired
    private InterfaceChocolate interfaceChocolate;
   
    @Autowired
    private InterfaceUser interfaceUser;
    
    @Autowired
    private InterfaceOrder interfaceOrder;
    
    
    public static void main(String[] args) {
	SpringApplication.run(Reto3WebApplication.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
       
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        interfaceChocolate.deleteAll();
        interfaceUser.deleteAll();
        interfaceOrder.deleteAll();
        
        
        
        
    }
        

}
