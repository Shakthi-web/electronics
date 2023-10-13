package com.electronics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electronics.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {

}
