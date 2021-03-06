package com.qa.assesment.ravijaganathan.jpa.services;

import com.qa.assesment.ravijaganathan.jpa.entities.Account;
import com.qa.assesment.ravijaganathan.jpa.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;


    /*Requirement 01: Adding new Account*/
    public void addAccount(Account account){
        accountRepository.save(account);
    }


    /*Requirement 02: get All Account*/
    public List<Account> getAllAccounts(){
        List<Account> accountList = new ArrayList<>();
        accountRepository.findAll().forEach(accountList::add);
        return accountList;
    }


    /*Requirement 03: Delete Account by ID*/
    public void deleteAccount(String accountNumber) {
        accountRepository.deleteById(accountNumber);
    }


}
