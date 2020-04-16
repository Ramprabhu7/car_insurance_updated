package com.car.Insurance.model;

import java.util.LinkedHashMap;


public class Insurance {
	private String Name;
	private String RTO;
	private String year;
	private String modelName;
	private String fuelType;
	private String variantType;
	private String regNo;
	private String DOP;
	private LinkedHashMap<String, String> modelnameTypes;
	private LinkedHashMap<String, String> allfuelTypes;
	private LinkedHashMap<String, String> allvarianttypes;

public Insurance() {
	modelnameTypes=new LinkedHashMap<>();
	modelnameTypes.put("benz", "Benz");
	modelnameTypes.put("audi", "Audi");
	modelnameTypes.put("bmw", "BMW");
	modelnameTypes.put("jaguar", "Jaguar");
	
	allfuelTypes=new LinkedHashMap<>();
	allfuelTypes.put("diesel", "Diesel");
	allfuelTypes.put("gas", "Gas");
	allfuelTypes.put("petrol", "Petrol");
	
	allvarianttypes=new LinkedHashMap<>();
	allvarianttypes.put("hatchBack","HatchBack");
	allvarianttypes.put("SUV","SUV");
	allvarianttypes.put("crossover","CrossOver");
	allvarianttypes.put("sedan","sedan");
}

public Insurance(String name,
		 String rTO, String year,
		String modelName, String fuelType, String variantType, String regNo, String dOP,
		LinkedHashMap<String, String> modelnameTypes, LinkedHashMap<String, String> allfuelTypes,
		LinkedHashMap<String, String> allvarianttypes) {
	super();
	Name = name;
	RTO = rTO;
	this.year = year;
	this.modelName = modelName;
	this.fuelType = fuelType;
	this.variantType = variantType;
	this.regNo = regNo;
	DOP = dOP;
	this.modelnameTypes = modelnameTypes;
	this.allfuelTypes = allfuelTypes;
	this.allvarianttypes = allvarianttypes;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getRTO() {
	return RTO;
}

public void setRTO(String rTO) {
	RTO = rTO;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getModelName() {
	return modelName;
}

public void setModelName(String modelName) {
	this.modelName = modelName;
}

public String getFuelType() {
	return fuelType;
}

public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}

public String getVariantType() {
	return variantType;
}

public void setVariantType(String variantType) {
	this.variantType = variantType;
}

public String getRegNo() {
	return regNo;
}

public void setRegNo(String regNo) {
	this.regNo = regNo;
}

public String getDOP() {
	return DOP;
}

public void setDOP(String dOP) {
	DOP = dOP;
}

public LinkedHashMap<String, String> getModelnameTypes() {
	return modelnameTypes;
}

public void setModelnameTypes(LinkedHashMap<String, String> modelnameTypes) {
	this.modelnameTypes = modelnameTypes;
}

public LinkedHashMap<String, String> getAllfuelTypes() {
	return allfuelTypes;
}

public void setAllfuelTypes(LinkedHashMap<String, String> allfuelTypes) {
	this.allfuelTypes = allfuelTypes;
}

public LinkedHashMap<String, String> getAllvarianttypes() {
	return allvarianttypes;
}

public void setAllvarianttypes(LinkedHashMap<String, String> allvarianttypes) {
	this.allvarianttypes = allvarianttypes;
}



}