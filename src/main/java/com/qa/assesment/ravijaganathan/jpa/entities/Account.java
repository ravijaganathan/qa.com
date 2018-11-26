package com.qa.assesment.ravijaganathan.jpa.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
@Getter  @Setter @NoArgsConstructor
public class Account {
    @Column(name="FIRSTNAME")
    private String firstName;
    @Column(name="LASTNAME")
    private String lastName;
    @Id
    @Column(name="ACCOUNTNUMBER")
    private String accountNumber;

}
