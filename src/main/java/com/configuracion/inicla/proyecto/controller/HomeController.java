package com.configuracion.inicla.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	private static final String Home_page = "/index";
	private static final String Admin_page = "/Administrador";
	
	@GetMapping(value = Home_page)
	public ModelAndView Default() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@GetMapping(value = Admin_page)
    public String Admin() {
        return "Administrador/Admin";
    }
}
