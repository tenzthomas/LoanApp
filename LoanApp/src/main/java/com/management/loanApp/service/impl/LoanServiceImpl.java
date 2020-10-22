package com.management.loanApp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.management.loanApp.dto.Loan;
import com.management.loanApp.repository.LoanRepository;
import com.management.loanApp.service.LoanService;;

@Component
public class LoanServiceImpl implements LoanService{
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${userAPIendpoint}")
	String userAPIendpoint;
	
	@Autowired
	LoanRepository loanRepo;
		
	@Override
	public int applyLoan(Loan loan) {
		int id = loan.getId();
		String loanType = loan.getLoanType();
		String date = loan.getDate();
		int loanAmount = loan.getLoanAmount();
		double rateOfInterest = Double.parseDouble(loan.getRateOfInterest());
		String dateDuration = loan.getDateOfDuration();
		int status = loanRepo.addLoan(id, loanType, loanAmount, date, rateOfInterest, dateDuration);
		return status;
	}


}
