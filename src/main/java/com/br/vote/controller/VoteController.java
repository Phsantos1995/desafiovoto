package com.br.vote.controller;


import com.br.vote.model.Vote;
import com.br.vote.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@RestController
@RequestMapping("/v1")
@Api(value = "Voto api rest funciona")
@CrossOrigin(origins = "*")
public class VoteController {

    @Autowired
    VoteService voteService;


    @GetMapping("/voto")
    @ApiOperation("Find a voto in VOTO LIST")
    public ResponseEntity<List<Vote>> getALL(){
        return new ResponseEntity<>(voteService.getVoto(), HttpStatus.OK);
    }

    @GetMapping("/voto/{id}")
    @ApiOperation("find a id")
    public  ResponseEntity<Vote> getById(@RequestBody Vote vote){
        return  new ResponseEntity<>(voteService.create(vote),HttpStatus.CREATED);
    }

    @PostMapping("/voto")
    @ApiOperation("Create")
    public ResponseEntity<Vote> create(@RequestBody Vote vote){
        return new ResponseEntity<>(voteService.create(vote),HttpStatus.CREATED);
    }

    @PutMapping("/voto")
    @ApiOperation("update")
    public  ResponseEntity<Vote>update(@RequestBody Vote vote){
        return new ResponseEntity<>(voteService.update(vote),HttpStatus.OK);
    }

    @DeleteMapping("/voto")
    @ApiOperation("remove")
    public  ResponseEntity<Vote>update(@RequestHeader Long Taskid){
        voteService.deleteVoto(Taskid);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
