package com.car.Insurance.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.car.Insurance.model.Admin;

@Service
public class InsuranceService {

	public Map<String, List<Admin>> gethash() {
		
		Map<String, List<Admin>> go = new HashMap<>();
		ArrayList<Admin> hm = new ArrayList<Admin>();

		hm.add(new Admin("audi", "diesel", 1.97f, 20, 100d, 50d, 1110d));
		hm.add(new Admin("audi", "gas", 1.37f, 20, 100d, 50d, 1110d));
		hm.add(new Admin("bmw", "diesel", 1.67f, 20, 100d, 50d, 1110d));
		hm.add(new Admin("bmw", "petrol", 1.37f, 20, 100d, 50d, 1110d));
		hm.add(new Admin("benz", "diesel", 1.97f, 20, 100d, 50d, 1110d));
		hm.add(new Admin("benz", "gas", 1.57f, 20, 100d, 50d, 1110d));

		ArrayList<Admin> hu = new ArrayList<Admin>();

		hu.add(new Admin("audi", "diesel", 2.97f, 20, 100d, 50d, 1110d));
		hu.add(new Admin("audi", "gas", 2.37f, 20, 100d, 50d, 1110d));
		hu.add(new Admin("bmw", "diesel", 2.67f, 20, 100d, 50d, 1110d));
		hu.add(new Admin("bmw", "petrol", 2.37f, 20, 100d, 50d, 1110d));
		hu.add(new Admin("benz", "diesel", 2.97f, 20, 100d, 50d, 1110d));
		hu.add(new Admin("benz", "gas", 2.57f, 20, 100d, 50d, 1110d));
		
		ArrayList<Admin> hd = new ArrayList<Admin>();

		hd.add(new Admin("audi", "diesel", 3.97f, 20, 100d, 50d, 1110d));
		hd.add(new Admin("audi", "gas", 3.37f, 20, 100d, 50d, 1110d));
		hd.add(new Admin("bmw", "diesel", 3.67f, 20, 100d, 50d, 1110d));
		hd.add(new Admin("bmw", "petrol", 3.37f, 20, 100d, 50d, 1110d));
		hd.add(new Admin("benz", "diesel", 3.97f, 20, 100d, 50d, 1110d));
		hd.add(new Admin("benz", "gas", 3.57f, 20, 100d, 50d, 1110d));


		go.put("TATA AIG", hm);
		go.put("HDFC ERGO", hu);
		go.put("UNITED INDIA", hd);
		return go;

	}
	
	//to get the showroom price from modelname and fueltype	
	public long getshowroom_price(String name,String fuel) {
		long price=0;
		if(name.equalsIgnoreCase("audi")&&fuel.equalsIgnoreCase("diesel")) {
			price=416000;
		}
		if(name.equalsIgnoreCase("audi")&&fuel.equalsIgnoreCase("gas")) {
			price=438000;
		}
		if(name.equalsIgnoreCase("benz")&&fuel.equalsIgnoreCase("diesel")) {
			price=449000;
		}
		if(name.equalsIgnoreCase("benz")&&fuel.equalsIgnoreCase("gas")) {
			price=368000;
		}
		if(name.equalsIgnoreCase("bmw")&&fuel.equalsIgnoreCase("diesel")) {
			price=372000;
		}
		if(name.equalsIgnoreCase("bmw")&&fuel.equalsIgnoreCase("petrol")) {
			price=232000;
		}
		return price;
	}
	
	//to get the difference in month
	public int getmonth(String year) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date parse = sdf.parse(year);
		Calendar c = Calendar.getInstance();
		c.setTime(parse);
		LocalDate userday = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE));
		LocalDate today = LocalDate.now();
		Period diff = Period.between(userday, today);
		int b=diff.getMonths();
		return b;
	}
	
	//to get the difference in years
	public int getyear(String year) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date parse = sdf.parse(year);
		Calendar c = Calendar.getInstance();
		c.setTime(parse);
		LocalDate userday = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE));
		LocalDate today = LocalDate.now();
		Period diff = Period.between(userday, today);
		int a=diff.getYears();
		return a;
	}
	
	//to get the depreciation amount 
	public List<Long> dep1(int month, int nyear, String name, String fuel) {
		long dep1 = 0;
		long dep2 = 0;
		long dep3 = 0;
		List<Long> depreciation=new ArrayList<Long>();
		List<String> all = getCompanyName();
		int ss = all.size();
		for (int i = 0; i < ss; i++) {
			String one = all.get(i);

			if (one.equalsIgnoreCase("TATA AIG") && month < 6 && nyear < 1) {
				dep1 = 5;
			} else if (one.equalsIgnoreCase("TATA AIG") &&month > 6 && nyear < 1) {
				dep1 = 15;
			} else if (one.equalsIgnoreCase("TATA AIG") &&nyear >= 1 && nyear < 2) {
				dep1 = 20;
			} else if (one.equalsIgnoreCase("TATA AIG") &&nyear >= 2 && nyear < 3) {
				dep1 = 30;
			} else if (one.equalsIgnoreCase("TATA AIG") &&nyear >= 3 && nyear < 4) {
				dep1 = 40;
			} else if (one.equalsIgnoreCase("TATA AIG") &&nyear >= 4 && nyear < 5) {
				dep1 = 50;
			}
			
			if (one.equalsIgnoreCase("HDFC ERGO") && month < 6 && nyear < 1) {
				dep2 = 7;
			} else if (one.equalsIgnoreCase("HDFC ERGO") &&month > 6 && nyear < 1) {
				dep2 = 17;
			} else if (one.equalsIgnoreCase("HDFC ERGO") &&nyear >= 1 && nyear < 2) {
				dep2 = 22;
			} else if (one.equalsIgnoreCase("HDFC ERGO") &&nyear >= 2 && nyear < 3) {
				dep2 = 33;
			} else if (one.equalsIgnoreCase("HDFC ERGO") &&nyear >= 3 && nyear < 4) {
				dep2 = 44;
			} else if (one.equalsIgnoreCase("HDFC ERGO") &&nyear >= 4 && nyear < 5) {
				dep2 = 55;
			}
			
			if (one.equalsIgnoreCase("UNITED INDIA") && month < 6 && nyear < 1) {
				dep3 = 3;
			} else if (one.equalsIgnoreCase("UNITED INDIA") &&month > 6 && nyear < 1) {
				dep3 = 12;
			} else if (one.equalsIgnoreCase("UNITED INDIA") &&nyear >= 1 && nyear < 2) {
				dep3 = 24;
			} else if (one.equalsIgnoreCase("UNITED INDIA") &&nyear >= 2 && nyear < 3) {
				dep3 = 28;
			} else if (one.equalsIgnoreCase("UNITED INDIA") &&nyear >= 3 && nyear < 4) {
				dep3 = 35;
			} else if (one.equalsIgnoreCase("UNITED INDIA") &&nyear >= 4 && nyear < 5) {
				dep3 = 41;
			}
		}
		depreciation.add(dep1);
		depreciation.add(dep2);
		depreciation.add(dep3);
		return depreciation;
	}
	
	
	//to get the IDV value
	public List<Long> getIDV1(String name,String fuel,int month,int year) {
		long insured = getshowroom_price(name, fuel); 
		long depreciation = 0;
		List<Long> IDV=new ArrayList<Long>();;
		List<Long> depreciation_percentage=dep1(month,year,name,fuel);
		int size=depreciation_percentage.size();
		for(int i=0;i<size;i++) {
			long value = depreciation_percentage.get(i);
			depreciation = (insured / 100) * value;
			long IDVvalue=insured-depreciation;
			IDV.add(IDVvalue);
		}
		
		return IDV;
	}
	
	//to get the name of the company
	public List<String> getCompanyName() {
		Map<String, List<Admin>> hm=gethash();
		List<String> all=new ArrayList<String>();
		
		for (Entry<String, List<Admin>> entry : hm.entrySet()) {
			System.out.println(entry.getKey());
			all.add(entry.getKey());
		}
		
		return all;
	}
	
	
	//to get the premium amount
	public List<Long> getPremium1(String name, String fuel, int month,int no_year) {
		long a = 0;
		Map<String, List<Admin>> hm=gethash();
		List<Long> all=new ArrayList<Long>();
		
		for (Entry<String, List<Admin>> entry : hm.entrySet()) {
			int i=0;
			System.out.println(entry.getKey());
			for(Admin d:entry.getValue()) {
				//System.out.println(d.getOwn_damage());
			boolean n=d.getModelNAme().equalsIgnoreCase(name) && d.getFueltype().equalsIgnoreCase(fuel);
			if(n) {
				List<Long> IDV=getIDV1(name, fuel, month, no_year);
				
				long damage = (long) ((IDV.get(i) / 100) * d.getOwn_damage());
				long claim = (damage / 100) * 20;
				long total_own = damage - claim;
				long net = (long) (total_own + d.getThird_party_cover() + d.getCover() + d.getLegal_liability());
				long service = (net / 100) * 14;
				a = net + service;	
				System.out.println(a);
				all.add(a);
			}
		}
			i++;
	}
		System.out.println(a);
		return all;
	}
}
