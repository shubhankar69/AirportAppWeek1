package com.sapient.week1.helper;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVFileParser {

	static List<String[]> airportsRecords = null;

	public static void loadAirportData() throws IOException, CsvValidationException {
		airportsRecords = new ArrayList<>();
		try (CSVReader csvReader = new CSVReader(
				new FileReader("D:\\JavaProject\\AirPortAppSapient\\AirportAppWeek1\\resource\\airports.csv"))) {
			String[] values = null;
			while ((values = csvReader.readNext()) != null) {
				airportsRecords.add(values);
			}
		}

	}

}
