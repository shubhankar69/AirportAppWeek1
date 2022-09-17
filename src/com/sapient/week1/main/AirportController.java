package com.sapient.week1.main;

import java.io.IOException;

import com.opencsv.exceptions.CsvValidationException;
import com.sapient.week1.helper.CSVFileParser;
import com.sapient.week1.model.Airport;
import com.sapient.week1.service.AirportServiceBL;

public class AirportController {

	public static void main(String[] args) {

		try {
			CSVFileParser.loadAirportData();
			AirportServiceBL service = new AirportServiceBL();
			Airport airport = service.fetchAirportsDetails(27241);
			System.out.println(airport);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
