package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String jsonPath) {
		
		//1.Mention your target folder location
        File f= new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberJava\\AllReports\\JvmReport");
        
        //2.Add Details
        Configuration c= new Configuration(f,"FACEBOOK APPLICATION");
        
        c.addClassifications("Platform","Windows");
        c.addClassifications("JDK Version","1.7");
        c.addClassifications("Tool","Eclipse");
        
        //3.Add the json path into list
        List<String>l= new ArrayList<>();
        l.add(jsonPath);
        
        
        //4.To call generateReprts()--It will generate the reports
        ReportBuilder r= new ReportBuilder(l, c);
        r.generateReports();
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
