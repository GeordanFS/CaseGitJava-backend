package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepositoriosDTO {
    @JsonProperty("id")
    public int id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("full_name")
    public String full_name;
    @JsonProperty("owner")
    public OwnerDTO owner;
    @JsonProperty("html_url")
    public String html_url;
    @JsonProperty("description")
    public String description;
    @JsonProperty("ssh_url")
    public String ssh_url;
    @JsonProperty("forks_count")
    public int forks_count;
    @JsonProperty("stargazers_count")
    public int stargazers_count;
 

    public RepositoriosDTO() {
    }

    public RepositoriosDTO(int id, String name, OwnerDTO owner, String html_url, String description, String ssh_url, int forks_count, int stargazers_count) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.html_url = html_url;
        this.description = description;
        this.ssh_url = ssh_url;
        this.forks_count = forks_count;
        this.stargazers_count = stargazers_count;
    }

    public int getForks_count() {
        return forks_count;
    }

    public void setForks_count(int forks_count) {
        this.forks_count = forks_count;
    }

    public int getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OwnerDTO getOwner() {
        return owner;
    }

    public void setOwner(OwnerDTO owner) {
        this.owner = owner;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSsh_url() {
        return ssh_url;
    }

    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }
}
