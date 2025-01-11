package com.cs.base_microservice;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
import com.cs.base_microservice.bean.LimitConfiguration;  
@RestController  
public class BaseMicroserviceConfigurationController   
{  
@GetMapping("/limits")  
public LimitConfiguration retriveLimitsFromConfigurations()  
{  
return new LimitConfiguration(1000, 1);  
}  
}  