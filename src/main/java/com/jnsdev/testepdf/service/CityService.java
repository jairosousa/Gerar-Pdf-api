package com.jnsdev.testepdf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnsdev.testepdf.entity.City;
import com.jnsdev.testepdf.repository.CityRepository;

@Service
public class CityService implements ICityService {

	@Autowired
	private CityRepository repository;

	@Override
	public List<City> findAll() {

		List<City> cities = repository.findAll();

		return cities;
	}
}
