package com.electronics.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import com.electronics.entity.Laptop;
import com.electronics.repository.LaptopRepository;
@Repository
public class LaptopDao {
@Autowired
LaptopRepository lr;
public static Logger log=Logger.getLogger(LaptopDao.class);
	public String setLaptop(Laptop l) {
		lr.save(l);
		return "Saved";
	}
	public String setAllLaptop(@RequestBody List<Laptop> l) {
		lr.saveAll(l);
		return "Successfully saved";
	}
	public Laptop getId(int x) {
		PropertyConfigurator.configure("log.properties");
		log.info("Reached Controller");
		return lr.findById(x).get();
	}
	public String deleteId(int x) {
		lr.deleteById(x);
		return "row"+x+"deleted";
	}
	public List<Laptop> getByBrand(String b) {
		return lr.getByBrand(b);
	}
	public List<Laptop> getByRange(int x, int y) {
		return lr.getByRange(x, y);
	}
	public List<Laptop> getMaxi() {
		return lr.getMaxi();
	}
	public List<Laptop> getOrder() {
		return lr.getOrder();
	}
	public List<Laptop> getGen() {
		return lr.getGen();
	}
	public int getGroup() {
		
		return lr.getGroup();
	}

}
