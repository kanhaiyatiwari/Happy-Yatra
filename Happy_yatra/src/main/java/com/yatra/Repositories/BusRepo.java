package com.yatra.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yatra.entities.users.Bus;

public interface BusRepo  extends JpaRepository<Bus, Integer>{

}
