package com.poc.blockchain.contractservice.controller;

import com.poc.blockchain.contractservice.model.Contract;
import com.poc.blockchain.contractservice.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    ContractService service;
    
    @GetMapping("/owner")
    public String getOwnerAccount() {
    	return service.getOwnerAccount();
    }
    
    @PostMapping
    public Contract createContract(@RequestBody Contract newContract) throws Exception {
    	return service.createContract(newContract);
    }
    
}
