package com.csvparserexample.java;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class App {
	public static void main(String[] args) throws IOException{
		// reading data from a csv file
		System.out.println("Reading data from csv :");
		ReadCsv readCsv = new ReadCsv();
		readCsv.readCsv();
		
		// reading data from a csv file and convert to java object
		
//		CsvtoJavaObject csvToJavaObject = new CsvtoJavaObject();
//		csvToJavaObject.convertCsvToJava();
	}
}
