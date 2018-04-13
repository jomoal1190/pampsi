package com.ingsoft.allpay.model;

import java.util.List;
import java.util.Map;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;

//@Document(collection = "Pib")
public class PIB {
//	@Id
	private String idCountry;
//	@Field
	private List<Map<String,String>> data ;
	public String getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}
	public List<Map<String, String>> getData() {
		return data;
	}
	public void setData(List<Map<String, String>> data) {
		this.data = data;
	}
	

}
