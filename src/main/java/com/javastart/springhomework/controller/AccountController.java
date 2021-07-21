package com.javastart.springhomework.controller;

import com.javastart.springhomework.controller.dto.AccountRequestDTO;
import com.javastart.springhomework.controller.dto.AccountResponseDTO;
import com.javastart.springhomework.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/accounts")
    public Long create(@RequestBody AccountRequestDTO accountRequestDTO){
        return accountService.save(accountRequestDTO.getName(),
                accountRequestDTO.getEmail(), accountRequestDTO.getBills());
    }
}
