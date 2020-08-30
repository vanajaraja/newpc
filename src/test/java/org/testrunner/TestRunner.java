package org.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReports;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="org.stepdefinition", dryRun=false,monochrome= true,
tags="@Smoke",plugin= {"pretty", "html:Reports\\HtmlReports", 
						"json:Reports\\JsonReports\\titanloginpage2.json",
						"junit:Reports\\XmlReports\\titanloginpage1.xml"} )

public class TestRunner {
	@AfterClass
	public static void JvmReportgeneration() {
		/*List <String> li = new ArrayList<String>();
		File f = new File ("C:\\Users\\RAJAPPA\\Desktop\\JavaPractise\\LogInSam\\Reports\\JsonReports");
		File[] listFiles = f.listFiles();
		for (String file : listFiles) {
			li.add(file);
			
		}*/
						
		JvmReports.generateJvmreports("C:\\Users\\RAJAPPA\\Desktop\\JavaPractise\\LogInSam\\Reports\\JsonReports\\titanloginpage2.json");
		
	}
}
