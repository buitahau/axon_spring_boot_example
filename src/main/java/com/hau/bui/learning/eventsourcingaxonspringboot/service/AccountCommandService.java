package com.hau.bui.learning.eventsourcingaxonspringboot.service;

import com.hau.bui.learning.eventsourcingaxonspringboot.dto.AccountCreateDTO;
import com.hau.bui.learning.eventsourcingaxonspringboot.dto.MoneyCreditDTO;
import com.hau.bui.learning.eventsourcingaxonspringboot.dto.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
