package com.sapient.week1.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.opencsv.exceptions.CsvValidationException;
import com.sapient.week1.exception.DataNotFoundException;
import com.sapient.week1.helper.CSVFileParser;

class AirportServiceBLTest {
	
	@BeforeAll
	static void loadAirportData() throws CsvValidationException, IOException {
		CSVFileParser.loadAirportData();
	}

	@Test
	void testExpectingExceptionAirportServiceData() {
		AirportServiceBL serviceBL = new AirportServiceBL();
		assertThrows(DataNotFoundException.class, () -> serviceBL.fetchAirportsDetails(27241112));
	}

}
