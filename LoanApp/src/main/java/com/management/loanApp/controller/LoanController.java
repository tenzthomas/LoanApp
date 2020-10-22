package com.management.loanApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.management.loanApp.dto.Loan;
import com.management.loanApp.service.LoanService;

@RequestMapping("/loanSystem")
@Controller
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	//apply Loan Service
	 @RequestMapping(value = "/applyLoanDetailsService", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> applyLoanDetailsService(@RequestBody Loan loan) {
		 loanService.applyLoan(loan);
	      return new ResponseEntity<>(loan, HttpStatus.CREATED);
	   }
}
