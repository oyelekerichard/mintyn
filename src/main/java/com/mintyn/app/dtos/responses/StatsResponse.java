package com.mintyn.app.dtos.responses;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class StatsResponse {

    private Boolean success;
    private Integer start;
    private Integer limit;
    private Integer size;

    private JSONPObject payload;
}
