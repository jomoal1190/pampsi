package com.ingsoft.allpay.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ingsoft.allpay.model.DPI;

import groovyjarjarcommonscli.ParseException;

@RestController
public class WsController {
	
    
    @PostMapping(value = "renapconsult")  
    public DPI  map(@RequestParam String cui) throws ParseException, IOException {

    	
    	
    	DPI dpi = new DPI();
    	
    	dpi.setCui("2506761840101");
    	dpi.setEstadoCivil("Soltero");
    	dpi.setFechaNac ("29/04/1991");
    	dpi.setPrimerNombre("Carlos");
    	
    	
    	
        return dpi;
    	
    	
    	
    
    }
    
    
    @PostMapping(value = "sibcreate")  
    public String sib(@RequestParam String dpi) throws ParseException, IOException {

        return "Registro Creado";
    }    
    

    @PostMapping(value = "afiliateUser")  
    public String afiliar(@RequestParam String cui) throws ParseException, IOException {
		return "true";


    }    
    
    
}
