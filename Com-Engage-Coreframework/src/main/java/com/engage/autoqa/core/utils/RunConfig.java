package com.engage.autoqa.core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class RunConfig {
	
	public void readPropertyFile() throws IOException {
		String path="";
		
	try {
		FileInputStream readfile= new FileInputStream(path);
		Properties property = new Properties();
		property.load(readfile);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	
	}
}
