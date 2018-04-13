package com.ingsoft.allpay.model;

import java.util.List;
import java.util.Map;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;

//@Document(collection = "importedDB")
public class ImportedDB {
	
//	@Id
	private String id ; 
//	@Field
	private String name;
//	@Field
	private List<String> campos;
//	@Field
	private List<Map<String,List<String>>> data;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCampos() {
		return campos;
	}
	public void setCampos(List<String> campos) {
		this.campos = campos;
	}
	public List<Map<String, List<String>>> getData() {
		return data;
	}
	public void setData(List<Map<String, List<String>>> data) {
		this.data = data;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
