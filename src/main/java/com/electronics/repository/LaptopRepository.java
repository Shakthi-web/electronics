package com.electronics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.electronics.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
	@Query(value="select * from electro_details where brand like ?",nativeQuery = true)
	List<Laptop> getByBrand(String b);
	@Query(value="select * from electro_details where price>? and price<?",nativeQuery = true)
	List<Laptop> getByRange(int x, int y);
	@Query(value="select * from electro_details where price=(select max(price) from electro_details)",nativeQuery = true)
	List<Laptop> getMaxi();
	@Query(value="select * from electro_details order by ram",nativeQuery = true)
	List<Laptop> getOrder();
	@Query(value="select * from electro_details order by generation desc",nativeQuery = true)
	List<Laptop> getGen();
	@Query(value="select count(id) from electro_details group by brand",nativeQuery = true)
	int getGroup();
}

