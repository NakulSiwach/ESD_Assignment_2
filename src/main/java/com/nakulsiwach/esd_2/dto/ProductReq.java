package com.nakulsiwach.esd_2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ProductReq(
        @JsonProperty("name")
        String name,
        @JsonProperty("price")
        float price

) {
}

