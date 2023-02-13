package com.bit.dp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	WebDriver dr;
	public void  gridPractice() throws Exception {
	
	DesiredCapabilities cap = DesiredCapabilities.chrome();
			//cap.setBrowserName("Chrome");
			cap.setPlatform(Platform.ANY);
	
		dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		dr.get("https://www.goole.com");
	}
	public void  gridPractice1() throws Exception {
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
				//cap.setBrowserName("Chrome");
				cap.setPlatform(Platform.ANY);
		
			dr=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		}

}
