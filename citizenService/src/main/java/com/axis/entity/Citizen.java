package com.axis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Citizen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private int vaccinationCenterId;
}
