package co.zw.qr.transactions.qrTransactions.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/qr/")
public class TransactionController {
	
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(TransactionController.class);
    
	
	@PostMapping(path = "/scanned")
    public Map<String, Object> scanned(@RequestBody Map<String, Object> data) {

	Map<String, Object> map = new LinkedHashMap<String, Object>();
	Map<String, Object> dataParent = new LinkedHashMap<>();
	
	
	log.info("######  " + data.get("merchant").toString());
	
//	{merchant=TM Ascort, account=12234567, bank=FBC, amount=288}
	return  data ;
	}
}
