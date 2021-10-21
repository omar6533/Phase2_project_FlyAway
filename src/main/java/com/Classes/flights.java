package com.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



public class flights {
	
	

 private String date;
 private String source;
 private String distiniation;
 private int NoPeople;
 
 
 
public flights( String date, String source, String distiniation, int noPeople) {
	super();
	
	this.date = date;
	this.source = source;
	this.distiniation = distiniation;
	NoPeople = noPeople;
}

public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDistiniation() {
	return distiniation;
}
public void setDistiniation(String distiniation) {
	this.distiniation = distiniation;
}
public int getNoPeople() {
	return NoPeople;
}
public void setNoPeople(int noPeople) {
	NoPeople = noPeople;
}
@Override
public String toString() {
	return "flights [ date=" + date + ", source=" + source + ", distiniation=" + distiniation
			+ ", NoPeople=" + NoPeople + "]";
}

 
 
 

}
