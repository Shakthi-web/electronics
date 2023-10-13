package com.electronics.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.electronics.dao.MobileDao;
import com.electronics.entity.Mobile;
@Service
public class MobileService {
	@Autowired
	MobileDao md;

	public String setMobile(Mobile x) {
		return md.setMobile(x);
	}

	public String setAllMobile(@RequestBody List<Mobile> x) {
		return md.setAllMobile(x);
	}

	public Mobile getbyId(int x) {
		return md.getbyId(x);
	}

	public List<Mobile> getAllMobile() {
		return md.getAllMobile();
	}

	public String deleteId(int x) {
		return md.deleteId(x);
	}
	public List<Mobile> getByRange(@PathVariable int p1,@PathVariable int p2){
		List<Mobile> x=getAllMobile();
		List<Mobile> z=x.stream().filter(y->y.getPrice()>=p1&&y.getPrice()<=p2).collect(Collectors.toList());
		return z;
	}

	public Mobile getMax(@RequestBody List<Mobile> y) {
		List<Mobile> x=getAllMobile();
		Mobile z= x.stream().max(Comparator.comparingInt(Mobile::getPrice)).get();
		return  z;
	}
	public Mobile getMin(@RequestBody List<Mobile> y) {
		List<Mobile> x=getAllMobile();
		Mobile z= x.stream().min(Comparator.comparingInt(Mobile::getPrice)).get();
		return  z;
}

	public List<String> getBrand() {
	    List<Mobile> x=getAllMobile();
	    List<String> z=x.stream().sorted(Comparator.comparingInt(Mobile::getPrice).reversed()).map(h->h.getBrand()).toList();
		return z;
	}

	public String addPrice() {
		List<Mobile> x=getAllMobile();
		List<Mobile> z=x.stream().filter(y->y.getRam()>=6).peek(j->j.setPrice(j.getPrice()+5000)).toList();
		setAllMobile(z);
		return "Saved Successfully";
	}

	public List<String> getName() {
		List<String> x=getAllMobile().stream().map(h->h.getBrand()).toList();
		return x;
	}
	public String update(int id, Mobile m) {
		Mobile x=getbyId(id);
		Mobile y=m;
		x.setBrand(y.getBrand());
		setMobile(x);
		return "Replaced Successfully";
	}
	
}
