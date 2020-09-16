package com.tati.tata.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "CLIENT")
@NoArgsConstructor
public class Client extends AbstractEntityGeneral{

    @Getter
    @Setter
    private String nomClient;

    @Getter
    @Setter
    private String prenom;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String pseudo;

}
