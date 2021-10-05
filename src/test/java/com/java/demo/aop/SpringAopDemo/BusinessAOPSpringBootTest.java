package com.java.demo.aop.SpringAopDemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.java.demo.aop.SpringAopDemo.business.BusinessLogic;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessAOPSpringBootTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Autowired
	BusinessLogic businessLogic;
	
	
	@Test
	public void TestBusinessLogic() {
		
		logger.info(businessLogic.getMeassage());
	}

}
