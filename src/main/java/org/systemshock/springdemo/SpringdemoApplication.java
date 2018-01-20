package org.systemshock.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.systemshock.springdemo.entities.Customer;
import org.systemshock.springdemo.entities.CustomerRepository;

@SpringBootApplication
public class SpringdemoApplication {

	private static final Logger log = LoggerFactory.getLogger( SpringdemoApplication.class );

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo( CustomerRepository repository ) {

	    return (args) -> {
            repository.save( new Customer( "He", "Man" ) );
            repository.save( new Customer( "She", "Ra" ) );
            repository.save( new Customer( "Gandalf", "The Grey" ) );
            repository.save( new Customer( "Iron", "Man" ) );
            repository.save( new Customer( "Dead", "Pool" ) );
            repository.save( new Customer( "Pinkie", "Pie" ) );

            log.info( "Customers found with findAll(): " );
            log.info( "-------------------------------" );

            for ( Customer customer : repository.findAll() ) {

                log.info( customer.toString() );

            }

            log.info( "" );

            Customer customer = repository.findOne( 1L );
            log.info( "Customer found with findOne(1l):" );
            log.info( "--------------------------------" );
            log.info( customer.toString() );
            log.info( "" );

            log.info( "Customer(s) found by findByLastName('Man'):" );
            log.info( "-------------------------------------------" );

            for ( Customer cust : repository.findByLastName( "Man" ) ) {

                log.info( cust.toString() );

            }

            log.info( "" );
        };
    }
}
