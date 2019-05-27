package vtt.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/g")
	public void g_m()
	{
		System.out.println("I am GET method in Java");
	}
}
