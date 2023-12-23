package com.mintyn.app.services;

import com.mintyn.app.configs.MintynProperties;
import com.mintyn.app.dtos.responses.StatsResponse;
import com.mintyn.app.dtos.responses.VerifyCardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class MintynService {

    @Autowired
    private MintynProperties mintynProperties;

    private final WebClient webClient;

    @Autowired
    public MintynService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<VerifyCardResponse> verifyCard()
    {
        WebClient client = WebClient.create(mintynProperties.getBaseUrl());

        Mono<VerifyCardResponse> verifyCardResponseMono= client
                .get()
                .uri("/5342123453")
                .retrieve()
                .bodyToMono(VerifyCardResponse.class);

        return verifyCardResponseMono;
    }

    public Mono<StatsResponse> cardStats()
    {
        WebClient client = WebClient.create(mintynProperties.getBaseUrl());

        MultiValueMap<String, String> bodyValues = new LinkedMultiValueMap<>();

        Mono<StatsResponse> statsResponseMono= client
                .get()
                .uri("/stats?start=1&limit=3")
                .retrieve()
                .bodyToMono(StatsResponse.class);

        return statsResponseMono;
    }
}
