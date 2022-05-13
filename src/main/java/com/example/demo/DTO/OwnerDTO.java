package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OwnerDTO {
    @JsonProperty("id")
    public int id;
    @JsonProperty("login")
    public String login;
    @JsonProperty("avatar_url")
    public String avatar_url;
    @JsonProperty("html_url")
    public String html_url;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
}
