package com.electronics.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.electronics.dao.LaptopDao;
import com.electronics.entity.Laptop;
@Service
public class LaptopService {
@Autowired
LaptopDao ld;
public static Logger log=Logger.getLogger(LaptopService.class);
	public String setLaptop(Laptop l) {
		
		return ld.setLaptop(l);
	}
	public String setAllLaptop(@RequestBody List<Laptop> l) {
		
		return ld.setAllLaptop(l);
	}
	public Laptop getId(int x) {
		PropertyConfigurator.configure("log.properties");
		log.info("Reached Controller");
		return ld.getId(x);
	}
	public String deleteId(int x) {
		return ld.deleteId(x);
	}
	public List<Laptop> getByBrand(String b) {
		return ld.getByBrand(b);
	}
	public List<Laptop> getByRange(int x, int y) {
		return ld.getByRange(x, y);
	}
	public List<Laptop> getMaxi() {
		return ld.getMaxi();
	}
	public List<Laptop> getOrder() {
		return ld.getOrder();
	}
	public List<Laptop> getGen() {
		return ld.getGen();
	}
	public int getGroup() {
		return ld.getGroup();
	}

}
