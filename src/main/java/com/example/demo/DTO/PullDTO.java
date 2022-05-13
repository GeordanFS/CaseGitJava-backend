package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PullDTO {
    @JsonProperty("id")
    public int id;
    @JsonProperty("user")
    public OwnerDTO user;
    @JsonProperty("title")
    public String title;
    @JsonProperty("created_at")
    public String created_at;
    @JsonProperty("body")
    public String body;
}
