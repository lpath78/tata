package com.tati.tata.model.entities;

import lombok.*;

import javax.persistence.MappedSuperclass;

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
