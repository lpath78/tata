package com.tati.tata.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@SuppressWarnings("serial")
@NoArgsConstructor
public class AbstractEntitiesChoix  extends AbstractEntityGeneral implements Serializable{
    @Getter
    @Setter
    private String Nom;
    @Getter
    @Setter
    private float prix;
}
