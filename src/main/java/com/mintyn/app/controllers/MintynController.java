package com.mintyn.app.controllers;

import com.mintyn.app.services.MintynService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("api/v1/")
public class MintynController {
    private MintynService mintynService;


}
