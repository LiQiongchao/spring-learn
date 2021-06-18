package com.tamecode.spring.core.service;

import com.tamecode.spring.core.service.impl.AccountServiceImpl;

public class ClientService {

    private static ClientService clientService = new ClientService();

    public static ClientService createInstance() {
        return clientService;
    }
}