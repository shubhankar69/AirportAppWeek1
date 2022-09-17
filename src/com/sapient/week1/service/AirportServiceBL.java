package com.sapient.week1.service;

import java.util.List;

import com.sapient.week1.dao.AirportDAO;
import com.sapient.week1.exception.DataNotFoundException;
import com.sapient.week1.model.Airport;

public class AirportServiceBL {

	public List<Airport> findAllAirports() {
		AirportDAO dao = new AirportDAO();
		return dao.findAll();
	}

	public Airport fetchAirportsDetails(Integer id) {
		AirportDAO dao = new AirportDAO();
		return dao.findById(id).orElseThrow(() -> new DataNotFoundException(id + ""));
	}

}
