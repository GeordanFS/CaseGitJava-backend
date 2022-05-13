package com.example.demo.controller;

import com.example.demo.DTO.ItemsDTO;
import com.example.demo.DTO.PullDTO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class ItauCaseController {

    @GetMapping("/projetos")
    public ResponseEntity projetos(){
        RestTemplate template = new RestTemplate();

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.github.com")
                .path("search/repositories")
                .queryParam("q", "language:Java")
                .queryParam("sort", "stars")
                .build();

        ResponseEntity<ItemsDTO> entidade = template.getForEntity(uri.toUriString(), ItemsDTO.class);
//        ResponseEntity<ItemsDTO> entidade = template.exchange(uri.toUriString(), HttpMethod.GET, HttpEntity.EMPTY, ItemsDTO.class);
        return entidade;
                //?q=language:Java&sort=stars
    }

    @GetMapping("/projetos/{owner}/{projeto}")
    public ResponseEntity repositorio(@PathVariable("owner") String owner, @PathVariable("projeto") String projeto){
        RestTemplate template = new RestTemplate();
        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("api.github.com")
                .path("repos/" + owner + "/" + projeto + "/pulls")
                .build();
        ResponseEntity<PullDTO[]> entidade = template.exchange(uri.toUriString(), HttpMethod.GET, HttpEntity.EMPTY, PullDTO[].class);

        return entidade;
    }

}
