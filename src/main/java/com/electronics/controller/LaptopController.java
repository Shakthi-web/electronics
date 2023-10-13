package com.electronics.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Laptop;
import com.electronics.service.LaptopService;

@RestController
public class LaptopController {
	@Autowired
	LaptopService ls;
	public static Logger log=Logger.getLogger(LaptopController.class);
	@PostMapping("/setLaptop")
public String setLaptop(@RequestBody Laptop l) {
		return ls.setLaptop(l);
	}
	@PostMapping("/setAllLaptop")
	public String setAllLaptop(@RequestBody List<Laptop> l) {
		return ls.setAllLaptop(l);
	}
	@GetMapping(path="/getId/{x}")
	public Laptop getId(@PathVariable int x) {
		PropertyConfigurator.configure("log.properties");
		log.info("Reached Controller");
	    return ls.getId(x);
	}
	@GetMapping(path="/deleteId/{x}")
	public String deleteId(@PathVariable int x) {
		return ls.deleteId(x);
	}
	@GetMapping(path="/getByBrand/{b}")
	public List<Laptop> getByBrand(@PathVariable String b){
		return ls.getByBrand(b);
	}
	@GetMapping(path="/getByRange?{x}/{y}")
	public List<Laptop> getByRange(@PathVariable int x,int y){
		return ls.getByRange(x,y);
	}
	@GetMapping(path="/getMaxi")
	public List<Laptop> getMaxi(){
		return ls.getMaxi();
	}
	@GetMapping(path="/getOrder")
	public List<Laptop> getOrder(){
		return ls.getOrder();
	}
	@GetMapping(path="/getGen")
	public List<Laptop> getGen(){
		return ls.getGen();
	}
	@GetMapping(path="/getGroup")
	public int getGroup() {
		return ls.getGroup();
	}
	@GetMapping(path="/getmessage")
	public String getmessage() {
		return "related service failed";
	}
	}
