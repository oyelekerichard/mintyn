package com.mintyn.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MintynService {

    private final WebClient webClient;

    @Autowired
    public MintynService(WebClient webClient) {
        this.webClient = webClient;
    }

}
