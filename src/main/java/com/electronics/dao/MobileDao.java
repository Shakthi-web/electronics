package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.electronics.entity.Mobile;
import com.electronics.repository.MobileRepository;
@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;
 public String setMobile(Mobile x) {
		mr.save(x);
		return "Saved" ;
	}
public String setAllMobile(@RequestBody List<Mobile> x) {
	mr.saveAll(x);
	return "Successfully saved";
}
public Mobile getbyId(int x) {
	return mr.findById(x).get();
}
public List<Mobile> getAllMobile() {
	return mr.findAll();
}
public String deleteId(int x) {
	mr.deleteById(x);
	return "row"+x+"deleted";
}

}
