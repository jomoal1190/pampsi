//package com.ingsoft.allpay.controllers;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.lang.annotation.Annotation;
//import java.nio.file.Paths;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
////import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.ingsoft.allpay.model.PIB;
//
//
//@Controller
//public class uploadController {
//
//@Autowired
////MongoTemplate mongoTemplate;
//
//	  @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
//	  @ResponseBody
//	  public ResponseEntity<?> uploadFile(
//	      @RequestParam("uploadfile") MultipartFile uploadfile) throws IOException {
//	     
//
//	      String filename = uploadfile.getOriginalFilename();
//	      File convFile = new File(uploadfile.getOriginalFilename());
//	      convFile.createNewFile(); 
//	      FileOutputStream fos = new FileOutputStream(convFile); 
//	      fos.write(uploadfile.getBytes());
//	      fos.close(); 
//
//	      
//	      
//
//
//	          FileInputStream excelFile = new FileInputStream(convFile);
//	          Workbook workbook = new XSSFWorkbook(excelFile);
//	          Sheet datatypeSheet = workbook.getSheetAt(0);
//	          Iterator<Row> iterator = datatypeSheet.iterator();
//	          List<String> columnas = new ArrayList<String>();
//	          
//
//	        
//	          for(int i =0; i<= datatypeSheet.getRow(0).getLastCellNum()-1; i++){ 
//	        	  Row row = datatypeSheet.getRow(0);
//	        	  Cell cell = row.getCell(i);
//	        	  columnas.add(cell.toString());
//	        	
//	          }
//	          
//
//		          
//		          List<Map<String,String>> data = new ArrayList<Map<String,String>>();
//		          
//	    		  for(int j =1; j< datatypeSheet.getLastRowNum(); j++){
//	    			  PIB pib = new PIB();
//	    			 Map<String, String> mapa = new HashMap<String, String>();
//	    			   for(int i =1; i< columnas.size(); i++){
//	            	  Row row = datatypeSheet.getRow(j);
//	            	  Cell cell = row.getCell(i); 
//	            	  Cell country = row.getCell(0); 
//	            	  	
//	            	  	pib.setIdCountry(country.toString());
//	            	  	
//	            	  	
//	              	  if(cell.toString()!="") {
//	              	
//	              		  mapa.put(columnas.get(i), cell.toString());
//
//	            	  }
//
//	        	  }
//	    			   data.add(mapa);
//	    			   pib.setData(data);
////	    			   mongoTemplate.save(pib);
//	    			   data.clear();
//	    			   mapa.clear();
//	    	  }
//
//	    return new ResponseEntity<>(HttpStatus.OK);
//	  } 
//	
//	  
//	  @RequestMapping(value = "/uploadVar", method = RequestMethod.POST)
//	  @ResponseBody
//	  public ResponseEntity<?> uploadVar(
//	      @RequestParam("uploadfile") MultipartFile uploadfile) throws IOException {
//	     
//
//	      String filename = uploadfile.getOriginalFilename();
//	      File convFile = new File(uploadfile.getOriginalFilename());
//	      convFile.createNewFile(); 
//	      FileOutputStream fos = new FileOutputStream(convFile); 
//	      fos.write(uploadfile.getBytes());
//	      fos.close(); 
//
//
//	          FileInputStream excelFile = new FileInputStream(convFile);
//	          Workbook workbook = new XSSFWorkbook(excelFile);
//	          Sheet datatypeSheet = workbook.getSheetAt(0);
//	          Iterator<Row> iterator = datatypeSheet.iterator();
//	          List<String> columnas = new ArrayList<String>();
//	          
//
//	        
//	          for(int i =0; i<= datatypeSheet.getRow(0).getLastCellNum()-1; i++){ 
//	        	  Row row = datatypeSheet.getRow(0);
//	        	  Cell cell = row.getCell(i);
//	        	  columnas.add(cell.toString());
//	        	
//	          }
//	          
//
//		          
//		          List<Map<String,String>> data = new ArrayList<Map<String,String>>();
//		          
//	    		  for(int j =1; j< datatypeSheet.getLastRowNum(); j++){
//	    			  PIB pib = new PIB();
//	    			 Map<String, String> mapa = new HashMap<String, String>();
//	    			   for(int i =1; i< columnas.size(); i++){
//	            	  Row row = datatypeSheet.getRow(j);
//	            	  Cell cell = row.getCell(i); 
//	            	  Cell country = row.getCell(0); 
//	            	  	
//	            	  	pib.setIdCountry(country.toString());
//	            	  	
//	            	  	
//	              	  if(cell.toString()!="") {
//	              	
//	              		  mapa.put(columnas.get(i), cell.toString());
//
//	            	  }
//
//	        	  }
//	    			   data.add(mapa);
//	    			   pib.setData(data);
////	    			   mongoTemplate.save(pib);
//	    			   data.clear();
//	    			   mapa.clear();
//	    	  }
//
//	    return new ResponseEntity<>(HttpStatus.OK);
//	  } 
//	
//
//}
