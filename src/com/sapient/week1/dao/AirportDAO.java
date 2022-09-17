package com.sapient.week1.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sapient.week1.helper.DataManager;
import com.sapient.week1.model.Airport;

public class AirportDAO {

	public List<Airport> findAllAirportsData() {
		List<Airport> airportList = new ArrayList<>();
		return DataManager.getAirportsRecords().stream().skip(1).map(elem -> {
			Airport airport = new Airport();
			airport.setId(Integer.parseInt(!elem[0].equalsIgnoreCase("") ? elem[0] : "0"));
			airport.setIdent(elem[1]);
			airport.setType(elem[2]);
			airport.setName(elem[3]);
			airport.setLatitude_deg(new BigDecimal(elem[4]));
			airport.setLongitude_deg(new BigDecimal(elem[5]));
			airport.setElevation_ft(Integer.parseInt(!elem[6].equalsIgnoreCase("") ? elem[6] : "0"));
			airport.setContinent(elem[7]);
			airport.setIso_country(elem[8]);
			airport.setIso_region(elem[9]);
			airport.setMunicipality(elem[10]);
			airport.setScheduled_service(elem[11]);
			airport.setGps_code(elem[12]);
			airport.setIata_code(elem[13]);
			airport.setLocal_code(elem[14]);
			airport.setHome_link(elem[15]);
			airport.setWikipedia_link(elem[16]);
			airport.setKeywords(elem[17]);
			airportList.add(airport);
			return airportList;
		}).collect(Collectors.toList()).get(0);
	}

	public List<Airport> findAll() {
		return this.findAllAirportsData();
	}

	public Optional<Airport> findById(Integer id) {
		return this.findAll().stream().filter(ap -> ap.getId().equals(id)).findFirst();
	}
}
