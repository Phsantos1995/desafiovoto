package com.br.vote.service;


import com.br.vote.exception.InvalidInputException;
import com.br.vote.exception.ResourceNotFoundException;
import com.br.vote.model.Pauta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  com.br.vote.repository.PautaRepository;

import java.util.List;

@Service
public class PautaService {

    @Autowired
    PautaRepository pautaRepository;


public Pauta create(Pauta pauta){
    return pautaRepository.save(pauta);
}


    public List<Pauta> getPauta(){
        return pautaRepository.findAll();
    }


    public Pauta findById(Long id){
        return pautaRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("ID"+id)
        );
    }

    public void deletePauta(Long PautaID){
        pautaRepository.deleteById(PautaID);
    }

    public Pauta update(Pauta pauta){


        if(pauta.getId()==null){
            throw new InvalidInputException("ID");
        }

        return pautaRepository.save(pauta);

    }



}
