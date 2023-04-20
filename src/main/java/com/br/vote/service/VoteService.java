package com.br.vote.service;


import com.br.vote.model.Vote;
import com.br.vote.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class VoteService {

    @Autowired
    VoteRepository voteRepository;

   @PostMapping
    public Vote create( Vote vote){
        return voteRepository.save(vote);
    }






}
