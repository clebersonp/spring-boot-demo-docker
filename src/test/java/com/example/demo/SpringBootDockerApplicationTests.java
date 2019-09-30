package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { SpringBootDockerApplication.class, AppConfigBean.class })
public class SpringBootDockerApplicationTests {

	@Autowired
	private AppConfigBean appConfigBean;

	@Test
	public void contextLoads() {
		System.err.println(String.format("Test Junit: %s", this.appConfigBean));
	}

}
