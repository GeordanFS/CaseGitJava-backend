package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ItemsDTO {
    @JsonProperty("items")
    public ArrayList<RepositoriosDTO> items;

    public ArrayList<RepositoriosDTO> getItems() {
        return items;
    }

    public void setItems(ArrayList<RepositoriosDTO> items) {
        this.items = items;
    }
}
