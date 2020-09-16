package com.tati.tata.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@SuppressWarnings("serial")
@NoArgsConstructor
public class AbstractEntitiesChoix implements Serializable extends AbstractEntityGeneral{
    @Getter
    @Setter
    private String Nom;
    @Getter
    @Setter
    private float prix;
}
