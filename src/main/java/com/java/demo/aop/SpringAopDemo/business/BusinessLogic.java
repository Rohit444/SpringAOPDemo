package com.java.demo.aop.SpringAopDemo.business;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.demo.aop.SpringAopDemo.DAOlayer.DAOLayer;


@Service
public class BusinessLogic {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	DAOLayer daoLayer;
	
	public String getMeassage() {
		log.info("Inside get Message ");
		
		return daoLayer.getData();
		
		
	}

}
