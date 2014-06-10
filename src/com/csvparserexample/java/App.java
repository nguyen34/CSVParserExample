package com.csvparserexample.java;

public class App {
	public static void main(String[] args){
		// reading data from a csv file
		System.out.println("Reading data from csv :");
		ReadCsv readCsv = new ReadCsv();
		readCsv.readCsv();
		
		// reading data from a csv file and convert to java object
		
		CsvtoJavaObject csvToJavaObject = new CsvtoJavaObject();
		csvToJavaObject.convertCsvToJava();
	}
}
