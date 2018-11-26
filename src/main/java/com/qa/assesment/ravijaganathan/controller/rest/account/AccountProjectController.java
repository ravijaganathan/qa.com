package com.qa.assesment.ravijaganathan.controller.rest.account;

import com.qa.assesment.ravijaganathan.jpa.entities.Account;
import com.qa.assesment.ravijaganathan.jpa.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountProjectController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method= RequestMethod.POST,value="/account-project/rest/account/json")
    public void addSecurity(@RequestBody Account account) {
        accountService.addAccount(account);
    }
}
