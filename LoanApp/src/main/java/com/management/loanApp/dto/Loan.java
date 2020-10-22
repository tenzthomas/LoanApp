package com.management.loanApp.dto;

import org.springframework.stereotype.Component;

@Component
	
public class Loan {
	private int id;
	private String loanType;
	private int loanAmount;
	private String date;
	private String rateOfInterest;
	private String dateOfDuration;
	
	public Loan() {
    }

    public Loan(int id, String loanType, int loanAmount, String date, String rateOfInterest, String dateOfDuration) {
        this.id = id;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.date = date;
        this.rateOfInterest = rateOfInterest;
        this.dateOfDuration = dateOfDuration;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public String getDateOfDuration() {
		return dateOfDuration;
	}
	public void setDateOfDuration(String dateOfDuration) {
		this.dateOfDuration = dateOfDuration;
	} 
	
	
}
