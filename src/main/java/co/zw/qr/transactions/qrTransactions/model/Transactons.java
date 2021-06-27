package co.zw.qr.transactions.qrTransactions.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name = "transactons")
public class Transactons {

	@Id
	@Column(name="id") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    public long  id; 
	
	@Column(name="sourceaccount") 
	public String sourceAccount ;
	
	
	@Column(name="sourcebank") 
	public String sourceBank ;
	
	@Column(name="destinationbank") 
	public String destinationBank ;
	
	@Column(name="destinationaccount") 
	public String destinationAccount ;
	
	@Column(name="amount") 
	public Double amount ;
	
}
