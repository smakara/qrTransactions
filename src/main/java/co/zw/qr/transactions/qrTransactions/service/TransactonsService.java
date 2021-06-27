package co.zw.qr.transactions.qrTransactions.service;

import java.util.List;

import co.zw.qr.transactions.qrTransactions.model.Transactons;

public interface TransactonsService {
	
	public Transactons saveTransactons(Transactons transactons);
	
	public List<Transactons> getTransactons(String sourceaccount);

}
