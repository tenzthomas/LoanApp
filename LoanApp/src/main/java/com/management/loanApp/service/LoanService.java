package com.management.loanApp.service;

import org.springframework.stereotype.Service;

import com.management.loanApp.dto.Loan;

@Service
public interface LoanService {
	
	public int applyLoan(Loan loan);
	
}
