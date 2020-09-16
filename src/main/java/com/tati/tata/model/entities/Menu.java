package com.tati.tata.model.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "MENU")
@SuppressWarnings("serial")
public class Menu {
    private TypeMenu typeMenu;
    private Burger burger;
    private Soda soda;
    private Accompagnement accompagnement;
    private Sauce sauce;

}
