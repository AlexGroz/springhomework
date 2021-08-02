package com.javastart.springhomework.controller;

import com.javastart.springhomework.controller.dto.DepositRequestDTO;
import com.javastart.springhomework.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {

    private final DepositService depositService;

    @Autowired
    public DepositController(DepositService depositService) {
        this.depositService = depositService;
    }

    @PostMapping("/deposit")
    public Object deposit(@RequestBody DepositRequestDTO depositRequestDTO){
        return depositService.deposit(depositRequestDTO.getAccountId(), depositRequestDTO.getAmount());
    }
}
