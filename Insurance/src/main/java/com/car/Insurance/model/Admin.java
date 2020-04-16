package com.car.Insurance.model;

public class Admin {
	
	private String modelNAme;
	private String fueltype;
	private float own_damage;   
	private int no_claim;
	private double cover;
	private double legal_liability;
	private double third_party_cover;

	
	public Admin() {
		
	}


	public Admin(String modelNAme, String fueltype, float own_damage, int no_claim, double cover,
			double legal_liability, double third_party_cover) {
		super();
		this.modelNAme = modelNAme;
		this.fueltype = fueltype;
		this.own_damage = own_damage;
		this.no_claim = no_claim;
		this.cover = cover;
		this.legal_liability = legal_liability;
		this.third_party_cover = third_party_cover;
	}




	public String getModelNAme() {
		return modelNAme;
	}


	public void setModelNAme(String modelNAme) {
		this.modelNAme = modelNAme;
	}


	public String getFueltype() {
		return fueltype;
	}


	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}


	public float getOwn_damage() {
		return own_damage;
	}


	public void setOwn_damage(float own_damage) {
		this.own_damage = own_damage;
	}


	public int getNo_claim() {
		return no_claim;
	}


	public void setNo_claim(int no_claim) {
		this.no_claim = no_claim;
	}


	public double getCover() {
		return cover;
	}


	public void setCover(double cover) {
		this.cover = cover;
	}


	public double getLegal_liability() {
		return legal_liability;
	}


	public void setLegal_liability(double legal_liability) {
		this.legal_liability = legal_liability;
	}


	public double getThird_party_cover() {
		return third_party_cover;
	}


	public void setThird_party_cover(double third_party_cover) {
		this.third_party_cover = third_party_cover;
	}


	
	
}
