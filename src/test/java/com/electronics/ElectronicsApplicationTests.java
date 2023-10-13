package com.electronics;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.electronics.controller.MobileController;

@SpringBootTest
class ElectronicsApplicationTests {
@Autowired
MobileController mc;
	@Test
	void contextLoads() {
	}
@Test
public void getTest() {
	assertNotNull(mc.getAllMobile());
}
}
