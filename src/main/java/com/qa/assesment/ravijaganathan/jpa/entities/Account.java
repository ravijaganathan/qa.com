package com.qa.assesment.ravijaganathan.jpa.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter  @Setter @NoArgsConstructor
public class Account {
    private String firstName;
    private String lastName;
    @Id
    //TODO: Account Number is not auto Generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String accountNumber;

}
