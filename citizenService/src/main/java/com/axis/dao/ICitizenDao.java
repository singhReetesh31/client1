package com.axis.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.Citizen;

public interface ICitizenDao extends JpaRepository<Citizen, Integer>{
List<Citizen> findCitizensByVaccinationCenterId(int id);
}
