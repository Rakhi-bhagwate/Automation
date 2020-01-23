package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	//Selenium Automation
	
	By username = By.xpath("//*[@id=\"txtUsername\"]");
	By password = By.xpath("//*[@id=\"txtPassword\"]");
	By loginbtn = By.xpath("//*[@id=\"btnLogin\"]");
}
