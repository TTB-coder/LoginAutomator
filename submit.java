package com.example;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;


public class submit {
	 public static void main(String[] args) {  
	        try {  
	            // Specify the path to your local HTML file  
	            //File file = new File("file:///C:/Users/anike/eclipse-workspace/testwithmaven/src/test/java/com/example/login.html");  
	            File file = new File("C://Users//anike//eclipse-workspace//testwithmaven//src//test//java//com//example//login.html");
	            
	            // Check if Desktop is supported  
	            if (Desktop.isDesktopSupported()) {  
	                // Get the Desktop instance  
	                Desktop desktop = Desktop.getDesktop();  

	                // Open the file in the default browser  
	                desktop.browse(file.toURI());  
	            } else {  
	                System.out.println("Desktop is not supported");  
	            }  
	        } catch (IOException e) {  
	            System.out.println("An error occurred while trying to open the file: " + e.getMessage());  
	        }  
	        
	        
	       
	        
	        
	        
	        
	       
	        
	        
	    }  
}