package com.tati.tata.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "SAUCE")
@SuppressWarnings("serial")
public class Sauce extends AbstractEntitiesChoix {
    @Getter
    @Setter
    private int nombreDeSauce;
}
