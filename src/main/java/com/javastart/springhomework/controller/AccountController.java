package com.javastart.springhomework.controller;

import com.javastart.springhomework.controller.dto.AccountResponseDTO;
import com.javastart.springhomework.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts/{accountsId}")
    public AccountResponseDTO getById(@PathVariable Long accountId){
        return new AccountResponseDTO(accountService.getById(accountId));
    }
}
