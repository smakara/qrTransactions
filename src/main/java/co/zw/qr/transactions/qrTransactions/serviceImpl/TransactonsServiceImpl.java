package co.zw.qr.transactions.qrTransactions.serviceImpl;

import java.util.List;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.zw.qr.transactions.qrTransactions.model.Transactons;
import co.zw.qr.transactions.qrTransactions.repository.TransactonsRepository;
import co.zw.qr.transactions.qrTransactions.service.TransactonsService;

@Service
public class TransactonsServiceImpl implements TransactonsService  {
	
	
	@Autowired
	private TransactonsRepository repo ;

	@Override
	public Transactons saveTransactons(Transactons transactons) {
		// TODO Auto-generated method stub
		return repo.save(transactons);
	}

	public List<Transactons> getTransactons(String sourceaccount) {
		
		return (List<Transactons>) repo.getTransactons(sourceaccount);
	}



}
