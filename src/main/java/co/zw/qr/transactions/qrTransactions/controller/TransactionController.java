package co.zw.qr.transactions.qrTransactions.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import co.zw.qr.transactions.qrTransactions.model.Transactons;
import co.zw.qr.transactions.qrTransactions.service.TransactonsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/qr")
public class TransactionController {
	
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(TransactionController.class);
	
	
	@Autowired
	public TransactonsService service  ; 
    
	
	@PostMapping(path = "/scanned/")
    public int scanned(@RequestBody Map<String, Object> data) {

	Map<String, Object> map = new LinkedHashMap<String, Object>();
	Map<String, Object> dataParent = new LinkedHashMap<>();
	
	
	log.info("######  get merchant " + data.get("merchant").toString());
	log.info("######  get merchant " + data.get("account").toString());
	log.info("######  get merchant " + data.get("bank").toString());
	log.info("######  get merchant " + data.get("amount").toString());
	
	
	Transactons tran = new Transactons();
	tran.setAmount(Double.parseDouble(data.get("amount").toString()));
	tran.setDestinationAccount(data.get("bank").toString());
	tran.setDestinationBank(data.get("account").toString());
	tran.setDestinationMarchant(data.get("merchant").toString());
//	{merchant=TM Ascort, account=12234567, bank=FBC, amount=288}
	
	log.info("######  saveTransactons " + service.saveTransactons(tran)); ;
	log.info("######  getAllTransactons " + service.getAllTransactons()); ;
	
	return  1 ;
	}
	
	
	@GetMapping(path = "/transactions")
    public List<Transactons> getscanned2() {

	
//	log.info("######  getAllTransactons " + service.getAllTransactons()); ;
//	
	return   service.getAllTransactons() ;
	}
	
	
	@GetMapping(path = "/transactionss")
     public List<Transactons>  getscanned() {

	
//	log.info("######  getAllTransactons " + service.getAllTransactons()); ;
//	
	return   service.getAllTransactons() ;
		
//		return  "test";
	}
}
