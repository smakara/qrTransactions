package co.zw.qr.transactions.qrTransactions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.zw.qr.transactions.qrTransactions.model.Transactons;



public interface TransactonsRepository extends JpaRepository<Transactons,Long>{
	
	@Query("FROM Transactons WHERE sourceaccount = ?1")
	public List<Transactons> getTransactons(String sourceaccount);

}
