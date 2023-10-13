package com.electronics.controller;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Mobile;
import com.electronics.service.MobileService;

@RestController
@RequestMapping("/mob")
public class MobileController {
@Autowired
MobileService ms;
public static Logger log=Logger.getLogger(MobileController.class);
@PostMapping("/setMobile")
public String setMobile(@RequestBody Mobile x) {
	return ms.setMobile(x);
}
@PostMapping("/setAllMobile")
public String setAllMobile(@RequestBody List<Mobile> x) {
	return ms.setAllMobile(x);
}
@GetMapping(path="/getbyId/{x}")
public Mobile getbyId(@PathVariable int x) {
	return ms.getbyId(x);
}
@GetMapping(path="/getAllMobile")
public List<Mobile> getAllMobile(){
	PropertyConfigurator.configure("log.properties");
	//log.info("Hello");
	log.info(ms.getAllMobile());
	return ms.getAllMobile();
}
@GetMapping(path="/deleteId/{x}")
public String deleteId(@PathVariable int x) {
	return ms.deleteId(x);
}
@GetMapping(path="/getByRange/{p1}/{p2}")
public List<Mobile> getByRange(@PathVariable int p1,@PathVariable int p2){
	return ms.getByRange(p1, p2);
}
@GetMapping(path="/getMax")
public Mobile getMax(@RequestBody List<Mobile> y){
	return ms.getMax(y);
}
@GetMapping(path="/getMin")
public Mobile getMin(@RequestBody List<Mobile> y){
	return ms.getMin(y);
}
@GetMapping(path="/getBrand")
public List<String> getBrand() {
	return ms.getBrand();
}
@GetMapping(path="/getName")
public List<String> getName(){
	return ms.getName();
}
@PutMapping(path="/addPrice")
public String addPrice() {
	return ms.addPrice();
}
@PutMapping(path="/update/{id}")
public String update(@PathVariable int id,@RequestBody Mobile m) {
	return ms.update(id,m);
}

}