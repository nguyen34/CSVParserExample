package com.csvparserexample.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class ReadCsv {
	public void readCsv () throws IOException{
//		String csvFileToRead = "csvFiles/healthlinkbc_Pharmacies.csv";
		DataRetriever dr = new DataRetriever();
		BufferedReader br = dr.fetchCSV();
//		BufferedReader br = null;
		String line = "";
		String splitBy = "	";
		
		try {
			///Sets up bufferedReader for csv file
//			br = new BufferedReader(new FileReader(csvFileToRead));
			///iterates through csv file line per line
		while ((line = br.readLine()) != null){
			
			// split on space ('   ')
			String[] pharmacies = line.split(splitBy);
			// print out contents of array
			
	
			System.out.println("PHARMACIES [type=" + pharmacies[1] + " , retailer=" + pharmacies[3] + " , service=" + pharmacies[5] + 
			" , description=" + pharmacies[6] + " , phone number=" + pharmacies[9] + " , website=" + pharmacies[10] + 
			" , wheelchair accessibility=" + pharmacies[12] + " , hours=" + pharmacies[14] + " , street=" + pharmacies[15] + " , city =" + pharmacies[19] + 
			" , province=" + pharmacies[20] + " , postal code=" + pharmacies[21] + " , latitude=" + pharmacies[22] + " , longitude=" + pharmacies[23] + "]");
			
		}
		//check for exceptions
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			if (br != null){
				try {
					br.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
		///Notify user that csv file is read
		System.out.println("Done with reading CSV");
	}
	
}
