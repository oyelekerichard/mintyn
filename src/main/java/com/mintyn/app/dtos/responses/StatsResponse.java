package com.mintyn.app.dtos.responses;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.util.MultiValueMap;

public class StatsResponse {

    private Boolean success;
    private Integer start;
    private Integer limit;
    private Integer size;
    private MultiValueMap payload;
}
