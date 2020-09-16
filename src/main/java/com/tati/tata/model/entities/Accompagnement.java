package com.tati.tata.model.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "ACCOMPAGNEMENT")
@SuppressWarnings("serial")
public class Accompagnement extends AbstractEntitiesChoix {
}
