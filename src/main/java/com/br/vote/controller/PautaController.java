package com.br.vote.controller;

import com.br.vote.model.Pauta;

import com.br.vote.model.Vote;
import com.br.vote.service.PautaService;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.http.HttpStatus;
@RestController
@RequestMapping("/v1")
@Api(value = "Pauta api rest funciona")
public class PautaController {

  @Autowired
    PautaService pautaService;
   @GetMapping("/pauta")
   public ResponseEntity<List<Pauta>>getAll(){
       return new ResponseEntity<>(pautaService.getPauta(), HttpStatus.OK);
   }
    @GetMapping("/pauta/{id}")
    @ApiOperation("find a id")
    public  ResponseEntity<Pauta> getById(@RequestBody Pauta pauta){
        return new ResponseEntity<>(pautaService.create(pauta),HttpStatus.CREATED);
    }


    @PostMapping("/pauta")
    @ApiOperation("Create")
    public ResponseEntity<Pauta> create(@RequestBody Pauta pauta){
        return new ResponseEntity<>(pautaService.create(pauta),HttpStatus.CREATED);
    }

    @PutMapping("/pauta")
    @ApiOperation("update")
    public  ResponseEntity<Pauta>update(@RequestBody Pauta pauta){
        return new ResponseEntity<>(pautaService.update(pauta),HttpStatus.OK);
    }

    @DeleteMapping("/pauta")
    @ApiOperation("remove")
    public  ResponseEntity<Vote>update(@RequestHeader Long Taskid){
        pautaService.deletePauta(Taskid);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
