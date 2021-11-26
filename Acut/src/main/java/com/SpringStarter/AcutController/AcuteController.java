package com.SpringStarter.AcutController;

import org.springframework.web.bind.annotation.GetMapping;

public class AcuteController {
	 @GetMapping("/test")
	   public String testendpoint(){
		 
		   return "Lokesh";
	   }
}
