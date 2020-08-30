package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReports {
	public static void generateJvmreports(String jsonFiles) {
		System.out.println("Report geneartion started");
		
		File f  = new File(System.getProperty("user.dir")+ "\\Reports\\JvmReports");
		
		Configuration con = new Configuration(f, "Titan WebSite");
		con.addClassifications("Sytem", "Windows 10");
		con.addClassifications("Browser", "Chrome 83");
		con.addClassifications("Selenium", "Verion 3.141.59");
		
		System.out.println("Configuration done");
		List<String> li = new ArrayList<String>();
		li.add(jsonFiles);
		ReportBuilder rb = new ReportBuilder(li, con);
		rb.generateReports();
		
	}

	

}