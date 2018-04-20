package com.hsbc.raven.cr.rest.controller;

import java.util.concurrent.atomic.AtomicLong;



import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.raven.cr.model.Risk;

@RestController
public class RiskController {
	
	private static final Logger LOGGER = Logger.getLogger(RiskController.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/risk")
    public Risk greeting(@RequestParam(value="name", defaultValue="World") String name) throws Exception {
    	LOGGER.info("RiskController : greeting : testing info method ");
    	if("test".equalsIgnoreCase(name)){
    		LOGGER.error("RiskController : greeting : testing error method ");
    		throw new Exception("Exception inside rest controller");
    	}
        return new Risk(counter.incrementAndGet(),
                            String.format(template, name));
    }  
    
    
   /* @RequestMapping("/risk")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) throws Exception {
    	RestTemplate restTemplate = new RestTemplate();
    	//https://cr-service2-dot-credit-risk-176312.appspot.com/risk        
        String risk = restTemplate.getForObject("https://cr-service2-dot-credit-risk-176312.appspot.com/risk", String.class);
        return "Response from third party service "+ risk; 
    }*/
    
   
    	
}