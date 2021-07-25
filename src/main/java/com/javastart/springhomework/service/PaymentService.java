package com.javastart.springhomework.service;

import com.javastart.springhomework.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {

    private final AccountService accountService;

    @Autowired
    public PaymentService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Object pay(Long accountId, BigDecimal amount){
        Account account = accountService.getById(accountId);
    }
}
