package com.javastart.springhomework.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class TransferRequestDTO {

    @JsonProperty("account_id_from")
    public Long accountIdFrom;

    @JsonProperty("account_id_to")
    private Long accountIdTo;

    @JsonProperty("amount")
    private BigDecimal amount;
}
