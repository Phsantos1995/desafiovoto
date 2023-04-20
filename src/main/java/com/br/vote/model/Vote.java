package com.br.vote.model;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import  lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "VOTE")



@Entity
public class Vote implements Serializable{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID", nullable = false)

        private Long id;
        @Column(name = "CPF",nullable = false)
        private String cpf;










}
