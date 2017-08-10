/**
 * 
 */
package com.gp.searchcab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Main Entry point for Search Cab Micro Service
 * 
 * @author ganeshp
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SearchCabBootstrap {

	/**
	 * 
	 */
	public SearchCabBootstrap() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//http://localhost:8081/api/searchcab/locationcabtimedetail
		SpringApplication.run(SearchCabBootstrap.class, args);

	}

//	@Bean
//	ProtobufHttpMessageConverter protobufHttpMessageConverter() {
//		return new ProtobufHttpMessageConverter();
//	}
	
//	@Pointcut("execution(public * com.gp.searchcab.repository.LocationCabTimeDetailRepository+.*(..))")
//	public Object publicMethodInsideAClassMarkedWithResourceNotFound(ProceedingJoinPoint pjp) throws Throwable {
//
//	    System.out.println("publicMethodInsideAClassMarkedWithResourceNotFound " + pjp.getTarget().toString());;
//
//	    Object retVal =  pjp.proceed();
//	    
//	    System.out.println("");
//	   
//	    return retVal;
//	}

}
