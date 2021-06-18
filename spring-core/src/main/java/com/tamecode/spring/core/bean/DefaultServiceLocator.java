package com.tamecode.spring.core.bean;

import com.tamecode.spring.core.service.AccountService;
import com.tamecode.spring.core.service.ClientService;
import com.tamecode.spring.core.service.impl.AccountServiceImpl;

public class DefaultServiceLocator {

    private static ClientService clientService = new ClientService();

    private static AccountService accountService = new AccountServiceImpl();

    private DefaultServiceLocator() {}

    public ClientService createClientServiceInstance() {
        return clientService;
    }


    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}