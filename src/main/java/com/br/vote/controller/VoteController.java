package com.br.vote.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class VoteController {


    @GetMapping("/")
    public  String index(){
        return "deded";
    }

}
