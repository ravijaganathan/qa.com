package com.qa.assesment.ravijaganathan.controller.rest.account;

import com.qa.assesment.ravijaganathan.jpa.entities.Account;
import com.qa.assesment.ravijaganathan.jpa.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountProjectController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method= RequestMethod.POST,value="/account-project/rest/account/json")
    public void addAccount(@RequestBody Account account) {
        accountService.addAccount(account);
    }

    @RequestMapping(method= RequestMethod.GET,value="/account-project/rest/account/json")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/account-project/rest/account/json/{accountNumber}")
    public void deleteAccount(@PathVariable String accountNumber) {
        accountService.deleteAccount(accountNumber);
    }


}
