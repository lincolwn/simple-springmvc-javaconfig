/**
 * 
 */
package br.com.simpleapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Lincolwn Martins
 *
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "home";
	}
}
