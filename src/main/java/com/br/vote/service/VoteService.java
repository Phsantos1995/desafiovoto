package com.br.vote.service;


import com.br.vote.exception.InvalidInputException;
import com.br.vote.exception.ResourceNotFoundException;
import com.br.vote.model.Vote;
import com.br.vote.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    @Autowired
    VoteRepository voteRepository;

   public Vote create(Vote vote){


       return voteRepository.save(vote);
   }

   public List<Vote> getVoto(){
       return voteRepository.findAll();
   }

   public Vote findById(Long id){
       return voteRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("ID"+id)
               );
   }




   public void deleteVoto(Long votoID){
       voteRepository.deleteById(votoID);
   }

   public Vote update(Vote vote){

       if(vote.getId()==null){
           throw new InvalidInputException("ID");
       }

       return voteRepository.save(vote);

   }





}
