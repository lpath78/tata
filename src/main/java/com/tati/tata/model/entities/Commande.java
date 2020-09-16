package com.tati.tata.model.entities;

import antlr.collections.List;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "COMMANDE")
@SuppressWarnings("serial")
public class Commande {

    private List<Menu> toutLesMenus;
    private Client client;
    private LocalDate DateCommande;
}
