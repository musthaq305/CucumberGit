package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\Feature\\Login.feature"
                 ,glue="org.stepdefinition",dryRun=false,strict=true,monochrome=true
                 ,snippets=SnippetType.CAMELCASE,plugin= {
                "html:C:\\Users\\Admin\\eclipse-workspace\\CucumberJava\\AllReports\\HtmlReport",
                "junit:C:\\Users\\Admin\\eclipse-workspace\\CucumberJava\\AllReports\\JunitReport\\fb.xml",
                 "json:C:\\Users\\Admin\\eclipse-workspace\\CucumberJava\\AllReports\\JsonReport\\fb.json",
                 "rerun:C:\\Users\\Admin\\eclipse-workspace\\CucumberJava\\AllReports\\Rerun\\failed.txt"
                })

public class TestRunnerClass {

	
	@AfterClass
	public static void report() {
		
      JVMReport.generateJvmReport("C:\\Users\\Admin\\eclipse-workspace\\CucumberJava\\AllReports\\JsonReport\\fb.json");
	}
	
	
}
