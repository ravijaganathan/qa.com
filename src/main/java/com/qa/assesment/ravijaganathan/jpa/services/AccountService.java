package com.qa.assesment.ravijaganathan.jpa.services;

import com.qa.assesment.ravijaganathan.jpa.entities.Account;
import com.qa.assesment.ravijaganathan.jpa.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;


    /*Requirement 01: Adding new Account*/
    public void addAccount(Account account){
        accountRepository.save(account);
    }


}
