package com.java.demo.aop.SpringAopDemo.DAOlayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class DAOLayer {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public String getData() {
		
		log.info("Inside getData method ");
		return "Fetching data ";
	}

}
