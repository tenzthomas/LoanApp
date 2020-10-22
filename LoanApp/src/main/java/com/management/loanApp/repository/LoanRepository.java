package com.management.loanApp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.management.loanApp.dto.Loan;

@Repository
public class LoanRepository {
	
    @Autowired
    JdbcTemplate template;

    /*Getting all Loans from table*/
    public List<Loan> getAllLoans(){
            List<Loan> loans = template.query("select id, loanType, loanAmount, date, rateOfInterest,DateofDuration from Loan",(result,rowNum)->new Loan(result.getInt("id"),
            result.getString("loanType"),result.getInt("loanAmount"),result.getString("date"),result.getString("rateOfInterest"),result.getString("DateofDuration")));
    return loans;
    }
    
    /*Getting a specific Loan by Loan id from table*/
    public Loan getLoan(int LoanId){
    String query = "SELECT * FROM Loan WHERE ID=?";
    Loan loanDetails = template.queryForObject(query,new Object[]{LoanId},new BeanPropertyRowMapper<>(Loan.class));

    return loanDetails;
    }
    
    /*Adding an Loan into database table*/
    public int addLoan(int id,String loanType,int loanAmount,String date, double rateOfInterest, String DateofDuration){
    String query = "INSERT INTO Loan VALUES(?,?,?,?,?,?)";
    return template.update(query,id,loanType,loanAmount, date,rateOfInterest,DateofDuration );
    }
    
    /*delete an Loan from database*/
    public int deleteLoan(int id){
    String query = "DELETE FROM Loan WHERE ID =?";
        return template.update(query,id);
	    }

}
