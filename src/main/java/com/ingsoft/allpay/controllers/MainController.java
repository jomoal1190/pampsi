package com.ingsoft.allpay.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ingsoft.allpay.methods.MinCuadrados;
import com.ingsoft.allpay.services.CurrensyService;
import com.ingsoft.allpay.services.RestCountries;




@Controller

public class MainController {

	
	@Autowired
	RestCountries restCountries;
	@Autowired
	CurrensyService currensyService; 
	@Autowired
	MinCuadrados minCuadrados;
	
	@RequestMapping("/")
	public String home(Model model) {
	
		return "index";
	}

	@RequestMapping("started")
	public String started(Model model) {
		return "started";
	}
	
	@RequestMapping("upload")
	public String upload(Model model) {
		return "upload";
	}
	
	@RequestMapping("uploadvar")
	public String uploadvar(Model model) {
		return "uploadvar";
	}
	
	
//	@RequestMapping("countries")
//	public String countries() throws Exception {
//		restCountries.getCountries();
//		return null;
//	}
	
	
//	@RequestMapping("cambio")
//	public String cambio() throws Exception {
//		currensyService.getCurrency("USD");
//		return null;
//	}
//	
//	
//	@RequestMapping("mcuadrado")
//	public String cuadra() throws Exception {
//		minCuadrados.LRegresion();
//		return null;
//	}

	
	
	  
	
}
