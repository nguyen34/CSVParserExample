package com.csvparserexample.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class DataRetriever {
	
	String WEB_DATA = "http://pub.data.gov.bc.ca/datasets/174271//healthlinkbc_Pharmacies.txt";
	
	public DataRetriever() {
	}
	
	public BufferedReader fetchCSV() throws IOException {
		URL url = new URL(WEB_DATA);
		InputStream input = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(input, "UTF-8"));
		return br;
	}

}
