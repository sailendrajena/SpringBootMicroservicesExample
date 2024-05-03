package com.spring.elk.api.controller;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice/")
public class InvoiceController {
	
	private static final Logger logger = LoggerFactory.getLogger(InvoiceController.class);
	
	@GetMapping("getInvoice")
	public String getInvoice() {
		logger.info("Entering into getInvoice() method...");
		try {
			logger.info("Finding invoices....");
			throw new RuntimeException("Invoices are not found....");
		}catch(Exception ex) {
			logger.error("Unable to find invoice"+ex.getMessage());
			ex.printStackTrace();
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			logger.error("Exception is: "+sw.toString());
		}
		
		return "INVOICE";
	}
}
