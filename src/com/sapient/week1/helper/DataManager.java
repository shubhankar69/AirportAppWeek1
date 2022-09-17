package com.sapient.week1.helper;

import java.util.List;

public class DataManager {

	public static List<String[]> getAirportsRecords() {
		return CSVFileParser.airportsRecords;
	}

}
