package com.csvparserexample.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvparserexample.domain.Pharmacy;

public class CsvtoJavaObject {

	public void convertCsvToJava(){
		String csvFileToRead = "csvFiles/healthlinkbc_Pharmacies.csv";
		BufferedReader br = null;
		String line = "";
		String splitBy = "	";
		List<Pharmacy> pharmacyList = new ArrayList<Pharmacy>();
		
		try{
			
			br = new BufferedReader(new FileReader(csvFileToRead));
			
			String headerLine = br.readLine();
			while ((line = br.readLine()) != null){
				
				// split on space ('  ')
				String[] pharmacies = line.split(splitBy);
				
				// create pharmacy object to store values
				Pharmacy pharmacyObject = new Pharmacy();
				
				// add values from csv to pharmacy object
				pharmacyObject.setPharmacyType(pharmacies[1]);
				pharmacyObject.setRetailer(pharmacies[3]);
				pharmacyObject.setPharmacyService(pharmacies[5]);
				pharmacyObject.setDescription(pharmacies[6]);
				pharmacyObject.setPhoneNumber(pharmacies[9]);
				pharmacyObject.setWebsite(pharmacies[10]);
				pharmacyObject.setWheelchairAccessible(pharmacies[12]);
				pharmacyObject.setHours(pharmacies[14]);
				pharmacyObject.setStreet(pharmacies[15]);
				pharmacyObject.setCity(pharmacies[19]);
				pharmacyObject.setProvince(pharmacies[20]);
				pharmacyObject.setPostalCode(pharmacies[21]);
				pharmacyObject.setLatitude(Double.parseDouble(pharmacies[22]));
				pharmacyObject.setLongitude(Double.parseDouble(pharmacies[23]));
				
				// adding pharmacy objects to a list
				pharmacyList.add(pharmacyObject);
			}
			// print values stored in pharmacyList
			printPharmacyList(pharmacyList);
			
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
	}
	
	public void printPharmacyList(List<Pharmacy> pharmacyListToPrint){
		for (int i = 0; i < pharmacyListToPrint.size(); i++){
			System.out.println("PHARMACIES [type=" + pharmacyListToPrint.get(i).getPharmacyType() + " , retailer=" + pharmacyListToPrint.get(i).getRetailer() + " , service=" 
					+  pharmacyListToPrint.get(i).getPharmacyService() + " , description=" + pharmacyListToPrint.get(i).getDescription() + " , phone number=" 
					+ pharmacyListToPrint.get(i).getPhoneNumber() + " , website=" + pharmacyListToPrint.get(i).getWebsite()  + " , wheelchair accessibility=" + pharmacyListToPrint.get(i).getWheelchairAccessible() 
					+ " , hours=" + pharmacyListToPrint.get(i).getHours() + " , street=" + pharmacyListToPrint.get(i).getStreet() + " , city =" 
					+ pharmacyListToPrint.get(i).getCity() + " , province=" + pharmacyListToPrint.get(i).getProvince() + " , postal code=" 
					+ pharmacyListToPrint.get(i).getPostalCode() + " , latitude=" + Double.toString(pharmacyListToPrint.get(i).getLatitude()) + " , longitude=" + Double.toString(pharmacyListToPrint.get(i).getLongitude()) + "]");
					
		}
		
	}
}
