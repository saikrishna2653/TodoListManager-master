/**
 * 
 */
package com.anup.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anup
 *
 */

@RestController
public class HomeController {

	
	@RequestMapping(value="/", method =RequestMethod.GET)
	public String getHomePage() {
		
		
		return "index";
	}
	
}
