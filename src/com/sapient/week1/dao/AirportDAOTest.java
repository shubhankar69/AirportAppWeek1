package com.sapient.week1.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.opencsv.exceptions.CsvValidationException;
import com.sapient.week1.helper.CSVFileParser;
import com.sapient.week1.model.Airport;

class AirportDAOTest {

	@BeforeAll
	static void loadAirportData() throws CsvValidationException, IOException {
		CSVFileParser.loadAirportData();
	}

	@Test
	void testAirportDAOData() {
		AirportDAO airportDAO = new AirportDAO();
		Airport airport = airportDAO.findById(27241).get();
		int expected = 27241;
		assertEquals(expected, airport.getId());
	}
	
	@Test
	void testExpectingExceptionAirportDAOData() {
		AirportDAO airportDAO = new AirportDAO();
		assertThrows(NoSuchElementException.class, () -> airportDAO.findById(27241112).get());
	}

}
